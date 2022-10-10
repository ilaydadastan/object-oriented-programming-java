package main;

public class Employer {
    String firstName;
    String lastName;
    Department department;
    int workYear;
    private String ccNo;

    public Employer(String firstName, String lastName, int workYear, String ccNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.workYear = workYear;
        this.ccNo = ccNo;
    }

    public String getCcNo(String mask) {

        return this.ccNo.split(" ")[0] + mask + this.ccNo.split(" ")[3];
    }
}
