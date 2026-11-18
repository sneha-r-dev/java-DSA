package ObjectOrientedPrograming.polymorphism;

public class Color {

    int firstColor;

     void color(){
        System.out.println("This is the parent class of colours");
    }

    void color1(String a, int b){
        System.out.println("This is the parent class of colours");
    }
    void color2(int a , int b, int c){
        System.out.println("This is the parent class of colours");
    }

    public Color() {
    }

    public Color(int firstColor) {
        this.firstColor = firstColor;
    }
}
