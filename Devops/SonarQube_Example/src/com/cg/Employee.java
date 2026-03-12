
package com.cg;

/**
 * Represents an Employee entity.
 *
 * <p>This class contains basic employee information such as employee ID, name, and email.</p>
 *
 * @author Saksham Agrahari
 * @version 1.0
 */
public class Employee {

    /** Unique identifier of the employee */
    private int empId;

    /** Name of the employee */
    private String name;

    /** Email address of the employee */
    private String email;

    /**
     * Default constructor.
     */
    public Employee() {
        // Default constructor required for frameworks
    }

    /**
     * Parameterized constructor to create an Employee object.
     *
     * @param empId unique employee ID
     * @param name employee name
     * @param email employee email
     */
    public Employee(final int empId, final String name, final String email) {
        this.empId = empId;
        this.name = name;
        this.email = email;
    }

    /**
     * Returns employee ID.
     *
     * @return employee ID
     */
    public int getEmpId() {
        return empId;
    }

    /**
     * Sets employee ID.
     *
     * @param empId employee ID
     */
    public void setEmpId(final int empId) {
        this.empId = empId;
    }

    /**
     * Returns employee name.
     *
     * @return employee name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets employee name.
     *
     * @param name employee name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Returns employee email.
     *
     * @return employee email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets employee email.
     *
     * @param email employee email
     */
    public void setEmail(final String email) {
        this.email = email;
    }

    /**
     * Returns string representation of Employee object.
     *
     * @return formatted employee details
     */
    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
