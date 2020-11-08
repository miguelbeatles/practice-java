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
public class Client extends Person {

    private int idClient;
    private String admissionDate;
    private boolean vip;
    private static int countClient;

    public Client(String name, char gender, int age, String address,
            String admissionDate, boolean vip) {
        super(name, gender, age, address);
        this.idClient = ++Client.countClient;
        this.admissionDate = admissionDate;
        this.vip = vip;
    }

    public int getIdClient() {
        return this.idClient;
    }

    public String getAdmissionDate() {
        return this.admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = this.vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Client{idClient=").append(idClient);
        sb.append(", admissionDate=").append(admissionDate);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
