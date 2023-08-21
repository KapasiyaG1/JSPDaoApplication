
package model;


public class Employee 
{
    int empid,empsalary;
    String empname,empdept;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public int getEmpsalary() {
        return empsalary;
    }

    public void setEmpsalary(int empsalary) {
        this.empsalary = empsalary;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpdept() {
        return empdept;
    }

    public void setEmpdept(String empdept) {
        this.empdept = empdept;
    }

    @Override
    public String toString() {
        return "Employee{" + "empid=" + empid + ", empsalary=" + empsalary + ", empname=" + empname + ", empdept=" + empdept + '}';
    }
    
    
}
