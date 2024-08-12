package util;

import model.Employee;

public class AddAndDisplayEmployee {
    public static void main(String[] args) {

        // creating object

        Employee employee = new Employee();


        employee.setEmpid(1254);
        employee.setName("kanan");
        employee.setMobile("9955664455");
        employee.setDesignation("SDE");
        employee.setEmail("kanan@SDE.com");

        System.out.println("Employee details are: " + employee);
    }
}
