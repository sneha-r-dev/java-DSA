package ObjectOrientedPrograming.inheritance2;

public class Developer extends Microsoft{

    String language;

    public Developer(String language) {
        this.language = language;
    }

    public Developer(String companyName, String companyLocation, String department, String language) {
        super(companyName, companyLocation, department);
        this.language = language;
    }
}
