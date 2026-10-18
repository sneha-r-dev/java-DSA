package conditionals.assignments;

import java.util.Scanner;

public class August {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0;
        for (int i = 1; i <=num ; i++) {
            if(i%2==0){
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);


    }
}
