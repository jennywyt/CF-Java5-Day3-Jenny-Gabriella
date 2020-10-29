package Gabriella;
import java.util.Scanner;
import java.util.Arrays;

public class day4_A5 {

    public static void main(String[] args) {

        int[] arrNumbers = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<10; i++){
            System.out.println( "Please enter the next number and press Enter,"+"number"+(i+1)+" is:  ");
            arrNumbers[i]=sc.nextInt();
            //arrNumbers[i]=Integer.parseInt(sc.nextLine());


        }



    }



}
