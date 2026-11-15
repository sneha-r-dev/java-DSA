package ObjectOrientedPrograming.inheritance;

public class Main {
    public static void main(String[] args) {

//        Box box = new Box();
//        System.out.println(box.l+ " " + box.w + " " + box.h);

        BoxWeight box2 = new BoxWeight();
        System.out.println(box2.h+ " " +box2.weight);

        Box box4 = new BoxWeight(2,4,5,6);
        System.out.println(box4);

//        there are many variables in parent and child classes
//        you are given access to variable that are in ref type i.e BoxWeight
// when object is of parent type how wecan call the constructor of this ?
        BoxWeight box5 = new Box(2,4,5);
        System.out.println(box5);

    }
}
