package Arrays;

import java.util.Arrays;

public class ColNoFixed {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5},
                {7,8,9}
        };

        for(int row =0; row < arr.length;row++){
                System.out.println(Arrays.toString(arr[row]));
        }
    }
}
