package util;

import model.Employee;

public class AddAndDisplayEmployee {
    public static void main(String[] args) {

        // creating object

        Employee employee = new Employee();


        employee.setEmpid(1254);
        employee.setName("kadam");
        employee.setMobile("7738886723");
        employee.setDesignation("Software Developer Engineer");
        employee.setEmail("kadam@matrix.com");

        System.out.println("Employee details are: " + employee);
        System.out.println("----------------");
    }
}
