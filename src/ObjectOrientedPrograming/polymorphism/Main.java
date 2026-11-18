package ObjectOrientedPrograming.polymorphism;

public class Main {
    public static void main(String[] args) {

        Color color = new Red();
        Red red = new Red();
        Blue blue = new Blue();
        Green green = new Green(6);

        Color c =  new Blue();
        c.color();

//        color.color();

//        red.color();
//        blue.color();
//        green.color();

    }
}
