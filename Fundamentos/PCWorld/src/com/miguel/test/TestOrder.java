/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.test;

import com.miguel.pcworld.Computer;
import com.miguel.pcworld.Keyboard;
import com.miguel.pcworld.Monitor;
import com.miguel.pcworld.Mouse;
import com.miguel.pcworld.Order;

/**
 *
 * @author miguel
 */
public class TestOrder {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("LENOVO", 15);
        Keyboard keyboard = new Keyboard("inalambrico", "lenovooo");
        Mouse  mouse = new Mouse("alambrico", "leeenovo");
        Computer computer = new Computer("first COMPUTER", monitor, keyboard, mouse);
        Order order = new Order();
        order.addComputer(computer);
        order.showOrder();
    }
}
