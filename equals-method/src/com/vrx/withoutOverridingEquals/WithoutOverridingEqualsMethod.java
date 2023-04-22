package com.vrx.withoutOverridingEquals;

public class WithoutOverridingEqualsMethod {
    public static void main(String[] args) {
        System.out.println("Without Overriding equals() method");
        Employee employee1 = new Employee();
        employee1.setEmployeeId(101);
        employee1.setName("Vijay");

        Employee employee2 = new Employee();
        employee2.setEmployeeId(102);
        employee2.setName("Binod");

        System.out.println("Comparison between employee1 and employee2(without same data):");
        System.out.println(employee1.equals(employee2));

        Employee employee3 = new Employee();
        employee3.setEmployeeId(101);
        employee3.setName("Vijay");

        System.out.println("Comparison between employee1 and employee3(with same data):");
        System.out.println(employee3.equals(employee1));
    }
}
