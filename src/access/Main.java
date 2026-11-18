package access;

public class Main {
    public static void main(String[] args) {

        A a = new A(56);
        int num = a.num;

        System.out.println(a.getNum());
//        System.out.println(b);

        a.setNum(67);

    }
}
