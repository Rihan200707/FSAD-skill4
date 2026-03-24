package com.example.demo;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        int n = sc.nextInt();

        while (n-- > 0) {
            String pattern = sc.next();
            boolean found = false;

            for (int i = 0; i <= text.length() - pattern.length(); i++) {
                if (text.substring(i, i + pattern.length()).equals(pattern)) {
                    System.out.print(i + " ");
                    found = true;
                }
            }

            if (!found) {
                System.out.print("-1");
            }

            System.out.println();
        }

        sc.close();
    }
}