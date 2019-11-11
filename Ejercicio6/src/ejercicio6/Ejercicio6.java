/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author AA-LABB7PC02
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
        int subtotal =200;
        int iva =12;
        double descuento;
        
    if (subtotal> 100 ) {
        descuento =subtotal*5/100; 
         
    }
    else
    {
       descuento =0;
    }        
    iva = subtotal*12/100;
      double   total = subtotal+iva-descuento;
        System.out.println("Descuento es:");
        System.out.println(descuento);
        System.out.println("Total es:");
        System.out.println(total); 
        
}       
}