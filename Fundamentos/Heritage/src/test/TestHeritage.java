/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Client;
import domain.Employee;
import java.util.Date;

/**
 *
 * @author miguel
 */
public class TestHeritage {
    public static void main(String[] args) {
        Date date = new Date();
        String str = String.format("%tc", date );
        Employee employee = new Employee("Miguel", 35000.0);
        System.out.println("employee = " + employee);
        Client client = new Client("Martha", 'm', 25, "Av 525", str, false);
        System.out.println("client = " + client);
    }
}
