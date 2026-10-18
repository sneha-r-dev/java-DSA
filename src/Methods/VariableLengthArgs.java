package Methods;

import java.util.Arrays;

public class VariableLengthArgs {

    public static void main(String[] args) {

        fun(1,3,5,7,8);
        fun2("sneha",3,5,6,7,8);
    }
    static void fun2(String name,int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
