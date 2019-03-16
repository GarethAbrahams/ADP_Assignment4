package SRP_Violation;

import java.util.Date;

public class Employees{

    //This class breaks the law of SRP, as it has more than 1 responsibility (reason to change)

    private String employeeId;
    private String name;
    private String address;
    private Date dateOfJoining;

    public Employees(String employeeId, String name, String address, Date dateOfJoining) {
        this.employeeId = employeeId;
        this.name = name;
        this.address = address;
        this.dateOfJoining = dateOfJoining;
    }

    //responsibility 1
    public boolean isPromotionDue(){
        //promotion logic implementation
        return false;
    }

    //responsibility 2
    public Double calcTaxForCurrentYear(){
        //tax logic implementation
        double newSalary=0;
        return newSalary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }
}