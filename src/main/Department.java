package main;

import java.util.List;

public class Department {
    private String name;
    Employer manager;
    List<Employer> employers;

    public Department setName(String name){
        if ( "software".equals(name) || "sales".equals(name) || "product".equals(name)) {
            this.name=name;
        }
        return this;
    }

    public String getName() {
        return this.name;
    }

    public void setManager(Employer manager, int workYearExp) {
        if (manager.workYear >= workYearExp) {
            this.manager = manager;
        }

    }


    public String addEmployer(String name, String lastName){
        return this.name + " Added employer " + name + " " + lastName;
    }
    public String addEmployer(String name){
        return this.name + " Added employer " + name;
    }

    public Department (String name){
        this.name = name;
        System.out.println("Created the object");
    }

    public Department (){

        System.out.println("Created the object");
    }



}
