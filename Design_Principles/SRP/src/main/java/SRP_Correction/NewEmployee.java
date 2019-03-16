package SRP_Correction;

import java.util.Date;

public class NewEmployee{

    private String employeeId;
    private String name;
    private String address;
    private Date dateOfJoining;

    public NewEmployee(String employeeId, String name, String address, Date dateOfJoining) {
        this.employeeId = employeeId;
        this.name = name;
        this.address = address;
        this.dateOfJoining = dateOfJoining;
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