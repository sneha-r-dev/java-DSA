package primitives.assignmentsPrblm;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter number1");
        int num1 = input.nextInt();
        System.out.println("enter number2");
        int num2 = input.nextInt();
        System.out.print("Enter an operator (+, -, *, /): ");
        char op = input.next().charAt(0);
        if(op =='+'){
            System.out.println(num1+num2);
        } else if (op=='-') {
            System.out.println(num1-num2);
        } else if (op=='*') {
            System.out.println(num1*num2);
        } else if(op=='/') {
            System.out.println(num1/num2);
        } else{
            System.out.println("invalid");
        }

    }
}
