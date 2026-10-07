package primitives.assignmentsPrblm;

import java.util.Scanner;

public class Fibinaccai {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter number till where");
        int num = input.nextInt();

        int a =0,b=1;
        int sum =0;
        for(int i =0;i<num;i++){
            System.out.print(a + " ");
            int c = a+b;
            a = b;
            b = c;
        }

    }
}
