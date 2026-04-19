package org.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

import java.util.Random;

public class Prodotto {
    private int codice;
    private String nome;
    private String marca;
    private BigDecimal prezzo;
    private BigDecimal iva;

    public Prodotto(String nome, String marca, BigDecimal prezzo, BigDecimal iva) {
        Random rand = new Random();
        this.codice = rand.nextInt(9999);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // getter & setter

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }
    

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public String getIva() {
        return this.iva.multiply(new BigDecimal(100)) + "%";
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal getPrezzoConIva() {
        return prezzo.add(prezzo.multiply(iva)).setScale(2, RoundingMode.DOWN);
    }

    @Override
    public String toString(){
        if(nome != null){
         return codice + " - " + nome;
        }
        return null;
    }
}
