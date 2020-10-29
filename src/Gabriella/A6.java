package Gabriella;
import java.util.Scanner;
import java.util.Arrays;

public class A6 {

    public static void main(String[] args) {
        int a;
        int b;
        int c;

        Scanner sc = new Scanner(System.in);


        //System.out.println("Enter the first integer number:   "+a.sc.nextInt());

        System.out.println("Enter the first integer number:   ");
        a=sc.nextInt();
        System.out.println("Enter the second integer number:   ");
        b=sc.nextInt();
        System.out.println("Enter the third integer number:   ");
        c=sc.nextInt();

        int [] maxArr=findMaxOfThree(a,b,c);

        System.out.println("The biggest number is:  "+ maxArr[0]);
        System.out.println("The second biggest number is:  "+ maxArr[1]);
        System.out.println("The smallest number is:  "+ maxArr[2]);
    }

    public static int[] findMaxOfThree(int a,int b,int c){
        int[] maxArr = new int[3];

        if (a>b && a>c){

            maxArr[0]=a;
            if (b>c) {
                maxArr[1] = b;
                maxArr[2] = c;
            }else{
                maxArr[1] = c;
                maxArr[2] = b;
            }

        }else if (b>a && b>c){

            maxArr[0]=b;
            if (a>c) {
                maxArr[1] = a;
                maxArr[2] = c;
            }else{
                maxArr[1] = c;
                maxArr[2] = a;
            }

        }else {
            maxArr[0]=c;
            if (b>a) {
                maxArr[1] = b;
                maxArr[2] = a;
            }else{
                maxArr[1] = a;
                maxArr[2] = b;
            }

        }
        return (maxArr);


    }
    /*public static int findMaxOfTwo(int a,int b){
        if (a>b){
            return a;
        }else {
            return b;
        }
    }
    */
}
