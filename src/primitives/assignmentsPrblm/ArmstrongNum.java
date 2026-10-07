package primitives.assignmentsPrblm;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter number ");
        int num = input.nextInt();
        int newNum = num;
        int arm =0;
        while(newNum !=0){
            int ls = newNum %10;
            arm = arm + ls*ls*ls;
            newNum = newNum/10;
        }
        if(num == arm){
            System.out.println("Arm");
        }else {
            System.out.println("not arm");
        }

    }
}
