package org.example;

public class Main {
    public static void main(String[] args) {
        String[] plans = new String[3];
        Employee employee = new Employee(1, "Ali Veli", "ali@x.com", "1234", plans);

        employee.addHealthPlan(0, "Basic Plan");
        employee.addHealthPlan(0, "Premium Plan");
        employee.addHealthPlan(5, "Extra Plan");

        System.out.println(employee);

        String[] devs = new String[2];
        Company company = new Company(1, "TechZone", 50000, devs);
        company.addEmployee(0, "Ayşe");
        company.addEmployee(1, "Mehmet");
        company.addEmployee(1, "Ali");
        company.addEmployee(5, "Veli");

        System.out.println(company);
    }
}