package main;

import java.util.List;

public class Department {
    String name;
    Employer manager;
    List<Employer> employers;

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
