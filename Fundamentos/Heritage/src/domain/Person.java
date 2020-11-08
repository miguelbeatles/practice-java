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
public class Person {

    protected String name;
    protected char gender;
    protected int age;
    protected String address;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, char gender, int age, String address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person{name=").append(name);
        sb.append(", gender=").append(gender);
        sb.append(", age=").append(age);
        sb.append(", address=").append(address);
        sb.append('}');
        return sb.toString();
    }

    

}
