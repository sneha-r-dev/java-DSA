package javaBasics.flowchart_assignments;

import java.util.Scanner;

public class HCFandLCM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        int temp =0;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                temp = i;
            }

        }
        System.out.println("HCF" + temp);
        int LCM = num1*num2/temp;
        System.out.println("LCM" + LCM);
    }
}
