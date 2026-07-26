package com.walmart.karthik.test;

import java.util.*;

public class JavaBasics {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        double second = Double.parseDouble(scanner.nextLine());
        String third = scanner.nextLine();
        System.out.println("String: " + third);
        System.out.println("Double: " + second);
        System.out.println("Int: " + first);
    }
}