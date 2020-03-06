package com.nieyl.design.decorate;

import java.util.ArrayList;
import java.util.List;

/**
 * 导航栏抽象类
 */
public abstract class Navigation {

    protected List<Function> functions = new ArrayList<>();

    protected abstract String getDesc();

    protected abstract List<Function> getFunctions();
}
