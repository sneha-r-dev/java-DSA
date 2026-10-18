package conditionals.assignments;

import java.util.Scanner;

public class SumUntilUserInputZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int sum =0 ;
        while(true){
            num= in.nextInt();
            sum = sum +num;
            if(num == 0){
                break;
            }
        }
        System.out.println(sum);

    }
}
