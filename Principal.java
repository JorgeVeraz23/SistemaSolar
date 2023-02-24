/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2poo;

/**
 *
 * @author USER
 */
public class Principal {

    public static void main(String[] args) {
        Planeta p1 = new Planeta("Tierra",1,11.000,50.000,10000, 1000000,Planeta.tipoPlaneta.TERRESTRE,false);
        
        p1.imprimir();
        System.out.println(p1.densidad());
        System.out.println(p1.determinarExterior());
    }   
}
