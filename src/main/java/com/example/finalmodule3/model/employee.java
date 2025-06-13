package com.example.finalmodule3.model;

public class employee {
    private int empId;
    private String empName;
    private String empbirthOfDate;
    private String empAddress;

    employee(int empId, String empName, String empbirthOfDate, String empAddress) {
        this.empId = empId;
        this.empName = empName;
        this.empbirthOfDate = empbirthOfDate;
        this.empAddress = empAddress;
    }
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpbirthOfDate() {
        return empbirthOfDate;
    }

    public void setEmpbirthOfDate(String empbirthOfDate) {
        this.empbirthOfDate = empbirthOfDate;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }
}
