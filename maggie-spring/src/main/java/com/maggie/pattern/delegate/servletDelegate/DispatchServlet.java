package com.maggie.pattern.delegate.servletDelegate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Description:作为一个调度
 * author:MaggieHao
 * Date:2019-07-08
 * Time:22:02
 */
public class DispatchServlet extends HttpServlet {

    private List<Handler> handlerMapping = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        Class<?> memberController = MemberController.class;
        try {
            handlerMapping.add(new Handler().setController(memberController.newInstance())
                    .setMethod(memberController.getMethod("getMemberById",new Class[]{String.class}))
                    .setUrl("/web/getMemberById.json"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void service(HttpServletRequest request,HttpServletResponse response){
        //完成调度
        doDispath(request,response);
    }

    private void doDispath(HttpServletRequest request, HttpServletResponse response) {
        String uri = request.getRequestURI();
        Handler handler = null;
        for (Handler handler1 : handlerMapping) {
            if (uri.equals(handler1.getUrl())) {
                handler = handler1;
                break;
            }
        }

        Object object = null;
        try {
            object = handler.getMethod().invoke(handler.getController(), request.getParameter("mid"));

            try {
                response.getWriter().write(object.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    class Handler{
        private Object controller;
        private Method method;
        private String url;

        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }

        public String getUrl() {
            return url;
        }

        public Handler setUrl(String url) {
            this.url = url;
            return this;
        }
    }
}
