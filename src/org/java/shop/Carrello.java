package org.java.shop;

import java.util.Scanner;
import java.math.BigDecimal;

public class Carrello {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        Prodotto[] products = new Prodotto[2];
        // 2 in questo caso è a caso, giusto da esempio, 
        // sta a significare che metterò nel carrello 2 prodotti

        for(int i = 0; i < products.length; i++){
            System.out.println("Nome del prodotto: ");
            String productName = input.nextLine();

            System.out.println("Marca del prodotto: ");
            String productBrand = input.nextLine();

            System.out.println("Prezzo (iva esclusa) del prodotto: ");
            int productPrice = Integer.parseInt(input.nextLine());

            System.out.println("A quale categoria fa parte? tv, smartphone, cuffie ");
            String productCategory = input.nextLine();

            switch (productCategory) {
                case value:
                    
                    break;
            
                default:
                    break;
            }


        }
        
    }
}
