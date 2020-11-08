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
public class Mouse extends InputDevices {
    private final int idMouse;
    private static  int countMouses;
    
    
    public Mouse(String inputType, String mark){
        super(inputType, mark);
        this.idMouse = ++Mouse.countMouses;
    }

    public int getIdMouse() {
        return idMouse;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mouse{idMouse=").append(idMouse);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    

   
    
    
}
