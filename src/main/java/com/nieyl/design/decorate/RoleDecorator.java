package com.nieyl.design.decorate;

/**
 * 基本角色装饰器
 */
public abstract class RoleDecorator extends Navigation {

    public abstract String getDesc();

    //添加功能
    public abstract void addFunctions();
}
