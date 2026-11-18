package access;

public class subclass extends A{
    public subclass(int num) {
        super(num);
    }

    public static void main(String[] args) {
        A a = new A(4);
        int num = a.num;
    }
}
