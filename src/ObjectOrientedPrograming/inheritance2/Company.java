package ObjectOrientedPrograming.inheritance2;

public class Company {
    String companyName;
    String companyLocation;

    Company(){
        this.companyName = "dont know";
        this.companyLocation ="chennai";
    }

    public Company(String companyName, String companyLocation) {
        this.companyName = companyName;
        this.companyLocation = companyLocation;
    }

    Company(Company other){
        this.companyName = other.companyName;
        this.companyLocation = other.companyLocation;
    }
}
