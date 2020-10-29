package Jenny;

import java.util.Scanner;

public class A2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner((System.in));
            double number = scanner.nextDouble();
            if(number < 0){
                System.out.println( number + " is a small negative number.");
            }
            else if(number == 0){
                System.out.println("Zero");
            }
            else if(number > 1000000){
                System.out.println( number + " is large positive number");
            }
            else {
                System.out.println(number + " is a positive number");
            }
    }
/* A2. Write a Java program that reads a floating-point number and prints “zero” if the number is zero. Otherwise, print “positive” or “negative”. Add “small” if the value of the number is less than 1, or “large” if it exceeds 1,000,000.

Test Data:
25

Expected Output:
25 is a positive number

Test Data:
2 000 000
Expected Output :
2000000 is large positive number */

}
