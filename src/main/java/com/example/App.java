
package com.example;

public class App {

    public static String greet(String name) {
        return "Hello, " + name + "! Welcome to Maven CI/CD.";
    }

    public static void main(String[] args) {
        System.out.println(greet("Abhinav"));
    }
}
