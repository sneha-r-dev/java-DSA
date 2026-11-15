package Arrays;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {

        int[] arr = {3,5,7,8};
        System.out.println(Arrays.toString(arr));

        change(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void change(int[] num){
        num[0] = 99;
    }
}
