package SwitchCase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String fruit = in.nextLine();

        switch (fruit) {
            case "Mango" -> System.out.println("Mango is king of fruits");
            case "Apple" -> System.out.println("Apple is a sweet fruit");
            case "orange" -> System.out.println("Orange gives vitamin C");
            case "grapes" -> System.out.println("Grapes gives full vibe");
            default -> System.out.println("please enter valid fruit");
        }

    }
//    switch(fruit){
//        case "Mango":
//            System.out.println("Mango is king of fruits");
//            break;
//        case "Apple":
//            System.out.println("Apple is a sweet fruit");
//            break;
//        case "orange":
//            System.out.println("Orange gives vitamin C");
//            break;
//        case "grapes":
//            System.out.println("Grapes gives full vibe");
//            break;
//        default:
//            System.out.println("please enter valid fruit");
//    }



}
