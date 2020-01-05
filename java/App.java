package com.example;

public class App {
    public static void main(String[] args) {

        String param = (args.length == 0) ? "10" : args[0];

        for (int i = 0; i < Integer.parseInt(param); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
