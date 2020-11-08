/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.pcworld;

/**
 *
 * @author miguel
 */
public class Computer {
    private final int idComputer;
    private String name;
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;
    private static int countComputer;
    
    private Computer(){
        this.idComputer = ++countComputer;
    }
    
    public Computer(String name, Monitor monitor,Keyboard keyboard,Mouse mouse){
        this();
        this.name = name;
        this.monitor= monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Monitor getMonitor() {
        return this.monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return this.keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return this.mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public int getIdComputer() {
        return idComputer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computer{idComputer=").append(idComputer);
        sb.append(", name=").append(name);
        sb.append(", ").append(monitor.toString());
        sb.append(", ").append(keyboard.toString());
        sb.append(", ").append(mouse.toString());
        sb.append('}');
        return sb.toString();
    }
     
    
    
}
