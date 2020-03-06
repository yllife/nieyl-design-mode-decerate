package com.nieyl.design.decorate;

public class DecorateClient {

    public static void main(String[] args) {

        BaseNavigation baseNavigation = new BaseNavigation();
        System.out.println(baseNavigation.getDesc()+"："+baseNavigation.getFunctions());

        NormalUserNavigation normalUserNavigation = new NormalUserNavigation(baseNavigation);
        System.out.println(normalUserNavigation.getDesc()+":"+normalUserNavigation.getFunctions());

        SuperUserNavigation superUserNavigation = new SuperUserNavigation(normalUserNavigation);
        System.out.println(superUserNavigation.getDesc()+":"+superUserNavigation.getFunctions());
    }
}
