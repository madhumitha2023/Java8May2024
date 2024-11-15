package io.pragra.learning.aug10;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {
    static String company = "Pragra";
    private Integer empId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Double salary;

    public Employee(Integer empId, String firstName, String lastName, String phoneNumber, Double salary) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public Integer getEmpId() {
        return empId;
    }

    public static String getCompany() {
        return company;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", salary=" + salary +
                '}';
    }
}
