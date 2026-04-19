package org.java.shop;

import java.math.BigDecimal;

public class Televisore extends Prodotto{
    private int dimensioni;
    private boolean smart;

    public Televisore(String nome, String marca, BigDecimal prezzo, BigDecimal iva, int dimensioni, boolean smart){
        super(nome, marca, prezzo, iva);
        this.dimensioni = dimensioni;
        this.smart = smart;
    }

    // getter & setter

    public String getDimensioni(){
        return dimensioni + "pollici";
    }

    public String isSmart(){
        if(smart == true){
            return "Si";
        }else{
            return "No";
        }
    }

    public void setDimensioni( int dimensioni ){
        this.dimensioni = dimensioni;
    }
    public void setSmart( boolean smart){
        this.smart = smart;
    }

    @Override
    public String toString(){
        return super.toString() + "\nDimensioni: " + getDimensioni() + "\nSmart: " + isSmart();
    }
}
