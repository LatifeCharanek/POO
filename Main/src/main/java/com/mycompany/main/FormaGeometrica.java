/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author latife.flcharanek
 */
public abstract class FormaGeometrica{
    private String nome;
    
    public FormaGeometrica(){
    }
    
    public FormaGeometrica(String nome){
        this.nome = nome;
    }

    public String imprimir() {
        return "FormaGeometrica: nome='" + nome ;
    }
    
    
    public abstract double calcularArea();
    
}

    

