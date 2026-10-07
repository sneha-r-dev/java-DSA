package primitives.assignmentsPrblm;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principle");
        float p = input.nextInt();
        System.out.println("Enter the time");
        float t = input.nextInt();
        System.out.println("Enter the Rate Of Interest");
        float r = input.nextInt();
        float si = (p*t*r)/100;
        System.out.println(si);

    }
}
