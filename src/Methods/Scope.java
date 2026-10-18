package Methods;

public class Scope {

    static int a = 70;
    public static void main(String[] args) {
        System.out.println(a);
        int a = 30;
//        int a;
        System.out.println(a);

    }
}
