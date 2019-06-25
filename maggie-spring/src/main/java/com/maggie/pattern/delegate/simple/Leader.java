package com.maggie.pattern.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:一个领导是负责执行老板的命令，将老板的命令分配给员工进行处理，
 * leader只做一个汇报结果的工作
 * author:MaggieHao
 * Date:2019-06-25
 * Time:22:44
 */
public class Leader {
    //需要知道每个员工的特征和特长，分配任务

    private Map<String,IEmployee> register = new HashMap<>();

    public Leader() {
        register.put("encryption",new EmployeeA());
        register.put("architecture",new EmployeeB());
    }

    void doing(String command){
        register.get(command).doing(command);
    }
}
