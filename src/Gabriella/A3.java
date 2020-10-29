package Gabriella;
import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {

        String[] items = { "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        int number=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        number = sc.nextInt();   //something is missing !!!!!  it does not handle wrong input!

        if (number>0 && number <8){
            System.out.println(items[number-1]);
        }
        else {
            System.out.println("Week has only 7 days! Please restart the program and enter a number between 1 and 7!");
        }

        //Solution with Switch, in this case I do not use the array.
        System.out.println("-------------------------------------------");
        System.out.println("we calculate now with the switch command!");
        switch (number) {
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3 :
                System.out.print( "Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            case 7:
                System.out.print("Sunday- finally we can relax");
                break;
            default:
                System.out.print("Week has only 7 days!");
        }




    }


}
