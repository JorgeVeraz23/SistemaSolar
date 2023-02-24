/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2poo;

/**
 *
 * @author USER
 */
public class Planeta {
    private String nombre = null;
    private int cantidadSatelites = 0;
    private double masa = 0;
    private double volumen = 0;
    private int diametro = 0;
    private int distanciaMedia = 0;
    enum tipoPlaneta{GASEOSO,TERRESTRE,ENANO};
    private tipoPlaneta tipo;
    private boolean esObservable = false;

    public Planeta(String nombre, int cantidaSatelites, double masa, double volumen, int diametro, int distanciaMedia, tipoPlaneta tipo, boolean esObservable){
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaMedia = distanciaMedia;
        this.tipo = tipo;
        this.esObservable = esObservable;
       }

    public void imprimir(){
        System.out.println("nombre del planeta: "+nombre);
        System.out.println("cantidad de satelites: "+cantidadSatelites);
        System.out.println("masa del planeta: "+masa);
        System.out.println("volumen del planeta: "+volumen);
        System.out.println("diametro del planeta: "+diametro);
        System.out.println("distancia media del planeta: "+distanciaMedia);
        System.out.println("tipo de planeta: "+tipo);
        System.out.println("es observable el planeta?: "+esObservable);
    }
    
    //calcular densidad de un planeta como el cociente entre su masa y su volumen
    
    public double densidad(){
        return masa / volumen; 
    }
    
    public String determinarExterior(){
        int ua = 149597870;
        if((distanciaMedia >= ua * 2.1) && (distanciaMedia <= ua * 3.4)){
            return "Esta en el exterior";
        }else{
            return "Esta en el interior";
        }
    }
    

    
    
    
}
