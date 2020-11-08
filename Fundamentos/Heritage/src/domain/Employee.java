/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author miguel
 */
public class Employee extends Person {

    private int idEmployee;
    private double salary;
    private static int countEmployee;

    public Employee() {
        this.idEmployee = ++Employee.countEmployee;
    }

    public Employee(String name, double salary) {
        this();
        this.name = name;
        this.salary = salary;
    }

    public int getIdEmployee() {
        return this.idEmployee;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{idEmployee=").append(this.idEmployee);
        sb.append(", salary=").append(this.salary);
        sb.append(",").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
