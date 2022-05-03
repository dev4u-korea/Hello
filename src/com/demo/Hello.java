package com.demo;

public class Hello {

    public static void main(String args[]) {

        System.out.println("Hello World");

        if (args.length > 0) {

            int i = 1;
            for (String param: args) {
                System.out.printf("param[%d] = %s \n", i++, param);
            }
        }

    }
}
