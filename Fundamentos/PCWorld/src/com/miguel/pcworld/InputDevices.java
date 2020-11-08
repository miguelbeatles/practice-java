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
public class InputDevices {

    private String inputType;
    private String mask;

    public InputDevices() {

    }

    public InputDevices(String inputType, String mask) {
        this.inputType = inputType;
        this.mask = mask;
    }

    public String getInputType() {
        return this.inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public String getMask() {
        return this.mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InputDevices{inputType=").append(inputType);
        sb.append(", mask=").append(mask);
        sb.append('}');
        return sb.toString();
    }

}
