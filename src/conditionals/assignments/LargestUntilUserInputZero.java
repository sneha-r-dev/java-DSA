package conditionals.assignments;

import java.util.Scanner;

public class LargestUntilUserInputZero {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num;
        int largest =0;
        while(true){
            num = in.nextInt();
            if(num >  largest){
                largest = num;
            }
            if(num == 0){
                break;
            }
        }
        System.out.println(largest);

    }
}
