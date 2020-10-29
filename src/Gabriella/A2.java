package Gabriella;

import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {

        float number = 0.00f;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        //number = sc.nextFloat();   //something is missing !!!!!  it does not handle wrong input!
        number = Float.parseFloat(sc.nextLine());

    if (number>0.00f && number < 1000000f && number>1.00f) {
        System.out.println("This number is a positiv number");
    }
    else if (number>0.00f && number<1.00f) {
            System.out.println("This number is a small positiv number");
        }
    else if (number> 1000000.00f){
            System.out.println("This number is a large positiv number");
        }
    else if (number<0.00f){
            System.out.println("This number is a negativ number");
        }
    else if (number == 0.00f) {
            System.out.println("This number is zero");
        }
    else {
            System.out.println("Contact the programmer, there is something wrong!");
        }




    }



}
