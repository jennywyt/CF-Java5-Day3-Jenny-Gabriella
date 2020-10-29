package Jenny;

import java.util.Scanner;

public class A3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double x = scanner.nextDouble();

            if (x == 1){
                System.out.println(" Today is Monday.");
            }
            else if (x==2){
                System.out.println("Today is Tuesday.");
            }
            else if (x==3){
                System.out.println("Today is Wednesday");
            }
            else if (x==4){
                System.out.println("Today is Thursday");
        }
            else if (x==5){
                System.out.println("Today is Friday");
            }
            else if (x==6){
                System.out.println("Today is Saturday");
            }
            else if (x==7){
                System.out.println("Today is Sunday");
            }
            else{
                System.out.println("Week has only 7 days!");
            }
    }
}
