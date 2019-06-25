package com.maggie.pattern.proxyPattern.dbRoute.dynamicproxy.maggieproxy;

import java.lang.reflect.InvocationHandler;

/**
 * Description:
 * author:MaggieHao
 * Date:2019-05-25
 * Time:22:12
 */
public class MaggieProxy {
    public static final String ln = "\r\n";


    public static Object newProxyInstance(MaggieClassLoader loader,
                                          Class<?>[] interfaces,
                                          MaggieInvocationHandler h){

        String src = generateSrc(interfaces);

        return null;

    }

    private static String generateSrc(Class<?>[] interfaces) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("package com.maggie.pattern.proxyPattern.dbRoute.dynamicproxy.maggieproxy;"+ln);
        stringBuffer.append("import com.maggie.pattern.proxyPattern.Person" +ln);
        stringBuffer.append("import java.lang.reflect.*"+ln);
        stringBuffer.append("public class $Proxy0 implements"+ interfaces[0].getName() +"{"+ln);


        return null;
    }

}
