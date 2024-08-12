package model;

public class Employee {

    private int empid;
    private String name;
    private String mobile;
    private String designation;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }
// toString() method helps display/ print the object
    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", designation='" + designation + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
