package org.example;

public class Main {
    public static void main(String[] args) {
        printName("Tony");
        printYear(28);
        printEmail("baraikerrov10@gmail.com");
        printAddress("Zelenika 28-ma");
        printPhNumber(897388459L);
        printCode(9000L);
        printInfo("no info for now");
    }

    public static void printName(String name) {
        System.out.println(name);
    }

    public static void printYear(Integer year) {
        System.out.println(year);
    }

    public static void printEmail(String email) {
        System.out.println(email);
    }

    public static void printAddress(String address) {
        System.out.println(address);
    }

    public static void printPhNumber(long phoneNumber) {
        System.out.println(phoneNumber);
    }

    public static void printCode(long code) {
        System.out.println(code);
    }

    public static void printInfo(String info) {
        System.out.println(info);
    }
}