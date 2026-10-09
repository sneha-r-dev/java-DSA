package conditionals;

import java.util.Scanner;

public class FibinacciNUm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int a = 0;
        int b = 1 ;
        for(int i=0;i<=num;i++){
            int temp = a +b;
            a = b;
            b = temp;
        }
        System.out.println(b);

    }


}
