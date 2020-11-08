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
public class Keyboard extends InputDevices{
    private final int idKeyboard;
    private static int countKeyboard;
    
    public Keyboard(String inputType, String mark){
        super(inputType, mark);
        this.idKeyboard = ++Keyboard.countKeyboard;
    }

    public int getIdKeyboard() {
        return idKeyboard;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Keyboard{idKeyboard=").append(idKeyboard);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}
