package Methods;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
//        boolean ans =  isPrime(num);
//        System.out.println(ans);

//        System.out.println(armStrong(num));
//        for (int i =100; i<1000;i++){
//            if(armStrong(i)){
//                System.out.println(i+  " ");
//            }
//        }

//        System.out.println(evenOdd(num));
//            System.out.println(vote(num));
        System.out.println(product(num1,num2));
    }

    static int product(int a, int b){
        return a*b;
    }

    static boolean vote(int age){
        return age>= 18;
    }

    static boolean evenOdd(int n){
        return n % 2 == 0;
    }

    //print all three digit armstrong numbers
    static boolean armStrong(int num){
        int original = num;
        int sum = 0;
        while(num>0){
            int rem = num % 10;
            num = num /10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;
    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c =2;
        while(c*c <= n){
            if(n%c ==0 ){
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
