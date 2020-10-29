package Gabriella;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {

        int number = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        number = sc.nextInt();

        if (number >= 0) {
            System.out.println("This number is positiv");
        } else {
            System.out.println("This number is negativ");
        }


    }
}