package Methods;

import java.util.Arrays;

public class Change {
    public static void main(String[] args) {

    String name = "sneha";
    ChangeName(name);
    System.out.println(name);

    int[] arr = {1,4,7,9,10};
    ChangeArr(arr);
    System.out.println(Arrays.toString(arr));
    }

    static void ChangeName(String name){
        name = "shreya";
    }


    static void ChangeArr(int[] nums){
        nums[0]= 99;
    }


}
