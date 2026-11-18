package ObjectOrientedPrograming.polymorphism;

public class Green extends Color{
    @Override
    void color(){
        System.out.println("This is Green");
    }

    public Green() {
    }

    public Green(int firstColor) {
        super(firstColor);
    }
}
