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
public class Monitor {

    private final int idMonitor;
    private String mark;
    private double size;
    private static int countMonitor;

    private Monitor() {
        this.idMonitor = ++Monitor.countMonitor;
    }

    public Monitor(String mark, double size) {
        this();
        this.mark = mark;
        this.size = size;
    }

    public int getIdMonitor() {
        return this.idMonitor;
    }

    public String getMark() {
        return this.mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getSize() {
        return this.size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Monitor{idMonitor=").append(idMonitor);
        sb.append(", mark=").append(mark);
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }
    
    

}
