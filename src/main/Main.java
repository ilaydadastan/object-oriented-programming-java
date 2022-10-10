package main;


public class Main {
    public static void main(String[] args) {

        Department softwareDepartment = new Department("software");

        System.out.println(softwareDepartment.addEmployer("ilayda", "dastan"));
        System.out.println(softwareDepartment.addEmployer("ahmet can", "kepenek"));

        Department productDepartment = new Department("product");
       String x = productDepartment.addEmployer("hulya");
        System.out.println(x);

        Employer ilayda = new Employer("ilayda", "dastan", 4, "1111 2221 3332 4444");
        System.out.println(ilayda.getCcNo(" #### #### "));
        Employer ahmetcan = new Employer("ahmet can", "kepenek", 2, "9999 8888 7777 6666");
        System.out.println(ahmetcan.getCcNo(" xxxx xxxx "));
        Department salesDepartment = new Department();
        salesDepartment.setName("sales").setManager(ahmetcan, 4);
        // salesDepartment.setManager(ahmetcan,4);
       // salesDepartment.name="acm";
        System.out.println(salesDepartment.addEmployer("ilayda", "dastan"));


    }
}
