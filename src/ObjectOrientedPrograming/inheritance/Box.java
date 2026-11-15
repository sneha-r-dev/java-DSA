package ObjectOrientedPrograming.inheritance;

public class Box {
    double l;
    double w;
    double h;

    Box() {
        this.l =-1;
        this.h =-1;
        this.w=-1;
    }

    Box(double side) {
        this.w = side;
        this.l = side;
        this.h = side;
    }

    public Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    public void information(){
        System.out.println("Running the box");
    }
}
