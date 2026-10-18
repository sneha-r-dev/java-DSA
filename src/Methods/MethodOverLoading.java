package Methods;

public class MethodOverLoading {
    public static void main(String[] args) {
        fun(67);
        fun("sneha");
    }


    static void fun(int num){
        System.out.println(num);
    }
    static void fun(String s){
        System.out.println(s);
    }
}
