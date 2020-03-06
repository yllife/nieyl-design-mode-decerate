package com.nieyl.design.decorate;

import java.util.List;

public class BaseNavigation extends Navigation {

    protected String getDesc() {
        return "基础功能";
    }

    protected List<Function> getFunctions() {
        Function baseFunction = new Function();
        baseFunction.setNo("1");
        baseFunction.setName("咕泡商城");
        baseFunction.setDesc("咕泡学院商城");
        Function courseFunction = null;
        try {
            courseFunction = baseFunction.clone();
            courseFunction.setNo("2");
            courseFunction.setNo("课程介绍");
            courseFunction.setDesc("咕泡学院课程介绍");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        super.functions.add(baseFunction);
        super.functions.add(courseFunction);

        return super.functions;
    }

}
