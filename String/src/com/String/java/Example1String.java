package com.String.java;

public class Example1String {
    public static void main(String[] args) {


        String var = new String("hello");
        /*
        String is immutable because when ever we create string using new key word  the string is stored in heap
        and they have a memory address and when we want add extra content the content will change but
        it will stored in another memory address and old addres will distroy by the garbage
         */
        // for string in heap
        System.out.println("--- string in heapm memory ---");
        System.out.println(var.hashCode()+":before change: "+var);
        var = var .concat("java");
        System.out.println(var.hashCode()+" after change"+var);
      
        //System.out.println(var.concat("world"));

        // literal in string
        System.out.println("--- string literal ---");
        String var1= "java";
        System.out.println(var1.hashCode()+" :before change:"+var1);
        var1 = var1.concat("world");
        System.out.println(var1.hashCode()+":after change :"+var1);
    }
}
