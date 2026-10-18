package Methods;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {

        MessageGreet();


    }

    static void MessageGreet(){
        Scanner in = new Scanner(System.in);
        String messsage = in.nextLine();
        System.out.println("Hey!!" +  messsage);
    }
}
