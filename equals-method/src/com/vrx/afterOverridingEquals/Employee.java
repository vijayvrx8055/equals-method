package com.vrx.afterOverridingEquals;

import java.util.Objects;

public class Employee {
    private int employeeId;
    private String name;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) return false;
        return this.employeeId == ((Employee) object).getEmployeeId();
    }
}
