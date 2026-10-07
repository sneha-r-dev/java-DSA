package primitives.assignmentsPrblm;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter amount");
        double inr = input.nextInt();

        double usd = inr*0.010336;
        System.out.println(usd);

    }
}
