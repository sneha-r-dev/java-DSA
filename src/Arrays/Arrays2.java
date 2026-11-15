package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {

//        int[] arr = {7,8,9,12,16};
//        System.out.println(arr[0]);
//        System.out.println(arr[4]);

        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
//
//        for(int i =0; i< arr.length;i++){
//            arr[i] = in.nextInt();
//        }

//        for(int i =0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }

//        for(int num : arr){
//            System.out.println(num + " ");
//        }

//        System.out.println(Arrays.toString(arr));


//        string array
        String[] str = new String[5];
        for (int i=0;i<str.length;i++){
            str[i] =in.next();
        }
        System.out.println(Arrays.toString(str));

        str[0] ="sneha";
        System.out.println(Arrays.toString(str));
    }
}
