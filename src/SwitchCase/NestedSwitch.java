package SwitchCase;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int empNo = in.nextInt();

        switch(empNo){
            case 1:
                System.out.println("sneha");
                break;
            case 2:
                System.out.println("shreya");
                break;
            case 3:
                String department = in.next();
                System.out.println("employee Number 3 ");
                switch (department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Manage":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("No department entered");
                }
            break;
            default:
                System.out.println("enter valid empID");
        }

    }
}
