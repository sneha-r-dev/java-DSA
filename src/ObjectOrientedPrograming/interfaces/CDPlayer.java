package ObjectOrientedPrograming.interfaces;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("CD Player start playing");
    }

    @Override
    public void stop() {
        System.out.println("CD Player stop playing");

    }
}
