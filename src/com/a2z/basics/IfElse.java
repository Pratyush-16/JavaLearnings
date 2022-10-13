package com.a2z.basics;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        if( a % 2 == 0){
            System.out.println("It is Even number");
        }
        else
        {
            System.out.println("It is Odd number");
        }
    }
}
