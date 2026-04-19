package org.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto{
    private String colore;
    private boolean wireless;

    public Cuffie(String nome, String marca, BigDecimal prezzo, BigDecimal iva, String colore, boolean wireless){
        super(nome, marca, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;
    }

    // getter & setter

    public String getColore(){
        return colore;
    }

    public String isWireless(){
        if(wireless == true){
            return "Si";
        } else{
            return "No";
        }
    }

    public void setColore(String colore){
        this.colore = colore;
    }

    public void setWireless(boolean wireless){
        this.wireless = wireless;
    }

    @Override
    public String toString(){
        return super.toString() + "\nColore: " + getColore() + "\nWireless: " + isWireless();
    }
}
