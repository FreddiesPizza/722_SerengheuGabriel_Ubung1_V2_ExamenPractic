package com.company;

public class Offerte {

    private int ID;
    private String unternehmensname;
    private int preis;
    private double mehrwehrsteuer;
    private String address;
    private Ort ort;

    public Offerte(int ID, String unternehmensname, int preis, double mehrwehrsteuer, String address, Ort ort) {
        this.ID = ID;
        this.unternehmensname = unternehmensname;
        this.preis = preis;
        this.mehrwehrsteuer = mehrwehrsteuer;
        this.address = address;
        this.ort = ort;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUnternehmensname() {
        return unternehmensname;
    }

    public void setUnternehmensname(String unternehmensname) {
        this.unternehmensname = unternehmensname;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public double getMehrwehrsteuer() {
        return mehrwehrsteuer;
    }

    public void setMehrwehrsteuer(double mehrwehrsteuer) {
        this.mehrwehrsteuer = mehrwehrsteuer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Ort getOrt() {
        return ort;
    }

    public void setOrt(Ort ort) {
        this.ort = ort;
    }

    @Override
    public String toString() {
        return "Offerte{" +
                "ID= '" + ID + '\'' +
                ", unternehmensname= '" + unternehmensname + '\'' +
                ", preis= '" + preis + '\'' +
                ", merhrwehrtsteuer= '" + mehrwehrsteuer + '\'' +
                ", address= '" + address + '\'' +
                ", ort= '" + ort + '\'' +
                '}';
    }

}
