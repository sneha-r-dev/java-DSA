package ObjectOrientedPrograming;

public class Statics {

    int age;
    int bibnum;
    String name;
    static int distance;

    public Statics(int age, int bibnum, String name) {
        this.age = age;
        this.bibnum = bibnum;
        this.name = name;
        Statics.distance += 1;
    }
}
