package org.example;

/**
 * Data Types Class
 */
 class Person {
    private String fullName;
    private Boolean isAdmin;
    private Byte numberOfDependents;
    private Short departmentCode;
    private int age;
    private Long nationalID; // For Large Numbers
    private Float heightInMeters;
    private Double annualSalary; // Large Double Numbers
    private char maritalStatus;
    private boolean isActive;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public Byte getNumberOfDependents() {
        return numberOfDependents;
    }

    public void setNumberOfDependents(Byte numberOfDependents) {
        this.numberOfDependents = numberOfDependents;
    }

    public Short getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(Short departmentCode) {
        this.departmentCode = departmentCode;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getNationalID() {
        return nationalID;
    }

    public void setNationalID(Long nationalID) {
        this.nationalID = nationalID;
    }

    public Float getHeightInMeters() {
        return heightInMeters;
    }

    public void setHeightInMeters(Float heightInMeters) {
        this.heightInMeters = heightInMeters;
    }

    public Double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(Double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public char getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(char maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}


class DataTypesMain {
    public static void main(String[] args){
        // Manipulate datatypes here...

        Person person = new Person();
        person.setFullName("Mohamed Ismail");

        System.out.println("Name "+ person.getFullName());

    }
}