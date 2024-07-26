package com.accessmodifiers.java;

public class SubClass extends Access {
    public static void main(String[] args) {
        SubClass subClass;
        subClass = new SubClass();

        System.out.println("the protected var:" + subClass.q);
        System.out.println("the protected var:" + subClass.name);
        System.out.println("the protected var:" + subClass.var);
        subClass.m1();
        subClass.m2();
        subClass.m4();
    }
}
