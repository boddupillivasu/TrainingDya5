package com.accessmodifiers.java;

public class Access {
    int q = 10;// default
    public String name = "vasu";
    private float aFloat = 517.3f;
    protected Byte var = 122;

    void m1() {
        System.out.println("this is default method");
    }

    public void m2() {
        System.out.println("this is public method");
    }

    private void m3() {
        System.out.println("this is private method");
    }

    protected void m4() {
        System.out.println("this is protected method");
    }

    public static void main(String[] args) {
        Access access;
        access = new Access();
        System.out.println("the default value:" + access.q);
        System.out.println("the public value:" + access.name);
        System.out.println("the private value:" + access.aFloat);
        System.out.println("the protected value:" + access.var);
        access.m1();
        access.m2();
        access.m3();
        access.m4();


    }
}
