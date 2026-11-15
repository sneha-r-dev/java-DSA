package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

//        syntax
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(10);
//        list.add(56);
//        list.add(87);
//        list.remove(1);
//        System.out.println(list.contains(879));
//        list.set(0,88);
//        System.out.println(list);
        for(int i =0;i<5;i++){
            list.add(in.nextInt());
        }

        for(int i =0;i<5;i++){
            System.out.println(list.get(2));
        }

        System.out.println(list);
    }
}
