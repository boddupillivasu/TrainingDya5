package com.String.java;

public class Example2String {
    public static void main(String[] args) {


        // created string using string literal
        String s = "HelloWorld";

        // Returns the number of characters in the String.
        System.out.println("length of " + s + "is" + s.length());

        // Returns the character at ith index.
        System.out.println("Character at 2nd position = " + s.charAt(2));

        // Return the substring from the ith index character
        // to end of string
        System.out.println("Substring from index 3 is " + s.substring(3));

        // Returns the substring from i to j-1 index.
        System.out.println("Substring from index 2 to index 4  = " + s.substring(2, 5));

        // Concatenates string2 to the end of string1.
        String s1 = "Hello";
        String s2 = "World";
        System.out.println("Concatenated string = " + s1.concat(s2));

        // Returns the index within the string
        // of the first occurrence of the specified string.
        String s4 = "Hello World";
        System.out.println("Index of World is  " + s4.indexOf("World"));

        // Checking equality of Strings
        Boolean out = "HELLO".equals("hello");
        System.out.println("Checking Equality of HELLO and hello " + out);

        out = "HELLO".equals("HELLO");
        System.out.println("Checking Equality " + out);

        out = "HeLlo".equalsIgnoreCase("Hello");
        System.out.println("Checking Equality " + out);

        // Converting cases
        String word1 = "World";
        System.out.println("Changing to lower Case " + word1.toLowerCase());

        // Converting cases
        String word2 = "world";
        System.out.println("Changing to UPPER Case " + word2.toUpperCase());

        // Trimming the word
        String word4 = " Welcome to Java ";
        System.out.println("Trim the word " + word4.trim());

        // Replacing characters
        String str1 = "Hello";
        System.out.println("Original String " + str1);
        String str2 = "Hello".replace('H', 'M');
        System.out.println("Replaced H with M -> " + str2);

        String split;
        split = " hi this is vasu studying nri institute of technoloy in ece branch";

        // split() method are used to convert to line to words and that words are stored in array

        String sp[] = split.split(" ");
        for (int i = 0; i < sp.length; i++) {
            System.out.println("after conver into words:" + sp[i]);
        }

        String split1;
        split1 = " hi #this#is#vasu#studying#nri#institute#of# technoloy #in #ece# branch";
        String sp1[] = split.split("#");
        for (int i = 0; i < sp1.length; i++) {
            System.out.println("after conver into words:" + sp1[i]);

        }
    }
}