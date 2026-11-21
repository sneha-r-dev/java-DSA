package ObjectOrientedPrograming.abstractDemo;

public class main {
    public static void main(String[] args) {

        Google google = new Developer();
        int sal = google.salary;
        System.out.println(sal);

        Developer dev = new Developer();
        dev.designation();

        Tester tester = new Tester();
        tester.designation();



    }
}
