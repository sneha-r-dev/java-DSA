package ObjectOrientedPrograming;

import access.A;

public class subclass extends A {
    public subclass(int num) {
        super(num);
    }

    public static void main(String[] args) {
        subclass a = new subclass(4);
        int num = a.num;
    }
}
