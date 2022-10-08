package main;


public class Main {
    public static void main(String[] args) {

        Department softwareDepartment = new Department("software");

        System.out.println(softwareDepartment.addEmployer("ilayda", "kepenek"));
        System.out.println(softwareDepartment.addEmployer("ahmet can", "kepenek"));

        Department productDepartment = new Department("product");

       String x = productDepartment.addEmployer("hulya");
        System.out.println(x);

        Department salesDepartment = new Department();
        salesDepartment.name = "sales";
        System.out.println(salesDepartment.addEmployer("ilayda", "dastan"));

    }
}
