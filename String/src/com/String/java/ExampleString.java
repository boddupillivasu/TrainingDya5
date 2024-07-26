package com.String.java;

public class ExampleString {
    public static void main(String[] args) {
        String variable;// literal String
        variable = "Hello Java";

        String var ;
        var = new String("hello");// stored in heap

        String variable1;
        variable1= "Hello Java";

        String va1r ;
        va1r = new String("hello java");
        /*
        it gives false because variable stored in string constant pool and
        var will stored in heap so it locates address  and gives false
         */
        System.out.println(var == variable);// false
         /*
        it gives false because variable stored in string constant pool and
        var will stored in heap so it locates address  and gives false
         */
        System.out.println(var == variable1);//false
          /*
        it gives true because variable stored in heap and
        variable1 will stored in heap so it checks the addres and gives the true
         */

        System.out.println(var == va1r);// true

         /*
        it gives true because variable stored in string constant pool and
        variable1 will stored in string constant pool so it checks the content and gives the true
         */
        System.out.println(variable.equals(variable1));//true

        System.err.println("the hashcode for variable:"+variable.hashCode());
        System.err.println("the hashcode for variable1:"+variable1.hashCode());



    }
}
