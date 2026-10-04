package javaBasics.flowchart_assignments;

import java.util.Scanner;

public class inputValueUntilX {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.println("Enter a number (or X to stop):");
            String input = sc.next();

            if (input.equalsIgnoreCase("X")) {
                break;
            }

            int num = Integer.parseInt(input);
            sum = sum + num;
        }

        System.out.println("Sum = " + sum);


    }
}
