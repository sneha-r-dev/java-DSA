package primitives.assignmentsPrblm;

import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String rev = "";
        for (int i = name.length()-1; i >=0 ; i--) {
            rev = rev + name.charAt(i);
        }
        if(rev.equals(name)){
            System.out.println("palindrome");
        }else{
            System.out.println("Not Palindrome");
        }


    }
}
