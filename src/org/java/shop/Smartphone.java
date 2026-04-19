package org.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto{
    private String codiceImei;
    private int memoria;

    public Smartphone( String nome, String marca, BigDecimal prezzo, BigDecimal iva, String codiceImei, int memoria){
        super(nome, marca, prezzo, iva);
        this.codiceImei = codiceImei;
        this.memoria = memoria;
    }

    // getter & setter

    public String getCodiceImei(){
        return codiceImei;
    }

    public int getMemoria(){
        return memoria;
    }

    public void setCodiceImei(String codiceImei){
        this.codiceImei = codiceImei;
    }

    public void setMemoria(int memoria){
        this.memoria = memoria;
    }

    @Override
    public String toString(){
        return super.toString() + "\nCodice IMEI: " + getCodiceImei() + "\nMemoria: " + getMemoria();
    }
}
