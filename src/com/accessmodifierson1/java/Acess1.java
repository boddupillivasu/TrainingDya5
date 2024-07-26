package com.accessmodifierson1.java;

import com.accessmodifiers.java.Access;

public class Acess1 extends Access {
    public static void main(String[] args) {
        Acess1 acess1;
        acess1 = new Acess1();

        System.out.println("the protected var:" + acess1.name);
        System.out.println("the protected var:" + acess1.var);
        acess1.m2();
        acess1.m4();
    }
}
