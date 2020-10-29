package Jenny;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        if (number > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }

    }

}
