package primitives;

public class typeCastingAndConverstion {
    public static void main(String[] args) {

//        Type casting
//        int num = (int)(67.89f);
//        System.out.println(num);
//
//        int num2 ='a';
//        System.out.println(num2);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);

    }
}
