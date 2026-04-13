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

    public String getWireless(){
        if(wireless == true){
            return "Le cuffie sono wireless";
        } else{
            return "Le cuffie sono cablate";
        }
    }

    public void setColore(String colore){
        this.colore = colore;
    }

    public void setWireless(boolean wireless){
        this.wireless = wireless;
    }
}
