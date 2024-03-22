/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adrian_eva2_operadores_logicos;

/**
 *
 * @author andyl
 */
public class ADRIAN_EVA2_OPERADORES_LOGICOS {

    public static void main(String[] args) {
        boolean hayDinero, hayBuenClima;
        //PARA HACER LA CARNE ASADA SE NECESITA:
        //HAYA DINERO Y HAYA BUEN CLIMA;
        hayDinero = false;
        hayBuenClima = false;
        
        System.out.println("1. NO HAY DINERO Y NO HAY BUEN CLIMA");
        if((hayDinero == true) && (hayBuenClima == true))
            System.out.println("SE ARMO LA CARNITA!!");
        else
            System.out.println("BUEVITO!!");
        
        hayDinero = false;
        hayBuenClima = true;
        
        System.out.println("2. NO HAY DINERO Y HAY BUEN CLIMA");
        if((hayDinero == true) && (hayBuenClima == true))
            System.out.println("SE ARMO LA CARNITA!!");
        else
            System.out.println("BUEVITO!!");
        
        hayDinero = false;
        hayBuenClima = true;
        
        System.out.println("3. NO HAY DINERO Y NO HAY BUEN CLIMA");
        if((hayDinero == true) && (hayBuenClima == true))
            System.out.println("SE ARMO LA CARNITA!!");
        else
            System.out.println("BUEVITO!!");
        
        hayDinero = true;
        hayBuenClima = true;
        
        System.out.println("2. HAY DINERO Y HAY BUEN CLIMA");
        if((hayDinero == true) && (hayBuenClima == true))
            System.out.println("SE ARMO LA CARNITA!!");
        else
            System.out.println("BUEVITO!!");
        
    }
}
