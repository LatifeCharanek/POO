/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author latife.flcharanek
 */
public class Circulo extends FormaGeometrica{
   
    private double raio;
    
    private final double pi = 3.14159;
    
    public Circulo() {
        super();
    }
    
    public Circulo (String nome, double raio){
        super(nome);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    
    @Override
    public double calcularArea(){
        
        return pi*(raio * raio);
    }
    
    @Override
    public String imprimir() {
        return ", raio= "+
                super.imprimir() + raio +", area= " + calcularArea();
}
}
