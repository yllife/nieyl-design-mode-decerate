package com.nieyl.design.decorate;

import java.util.List;

public class NormalUserNavigation extends RoleDecorator {

    private Navigation navigation;

    public NormalUserNavigation(Navigation navigation){
        this.navigation = navigation;
    }

    public String getDesc() {
        return navigation.getDesc()+"和普通用户权限的功能";
    }

    @Override
    protected List<Function> getFunctions() {
        return navigation.getFunctions();
    }

    public void addFunctions() {
        Function function = new Function();
        function.setNo("3");
        function.setName("作业中心");
        function.setDesc("用户可查看课程作业");
        navigation.functions.add(function);
    }
}
