package Methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sum();
        sum2();
    }

    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number 1");
        int num1 = in.nextInt();
        System.out.println("enter the number 2");
        int num2 = in.nextInt();
        int sum = num1 +num2;
        return sum;
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number 1");
        int num1 = in.nextInt();
        System.out.println("enter the number 2");
        int num2 = in.nextInt();
        System.out.println("The sum of numbers" + (num1+num2));
    }
}
