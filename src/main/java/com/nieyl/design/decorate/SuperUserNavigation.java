package com.nieyl.design.decorate;

import java.util.List;

public class SuperUserNavigation extends RoleDecorator {

    private Navigation navigation;

    public SuperUserNavigation(Navigation navigation){
        this.navigation = navigation;
    }

    public String getDesc() {
        return navigation.getDesc()+"和超级用户权限";
    }

    @Override
    protected List<Function> getFunctions() {
        return navigation.getFunctions();
    }

    public void addFunctions() {
        Function function = new Function();
        function.setNo("5");
        function.setNo("系统管理");
        function.setDesc("管理系统的相关功能");
        navigation.functions.add(function);
    }
}
