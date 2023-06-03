/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author latife.flcharanek
 */
public class IPVA {
   private double valorBase;
   private int quantidadeCavalos;
   
   
   
   public IPVA(double valorBase, int quantidadeCavalo){
       
       this.valorBase = valorBase;
       this.quantidadeCavalos= quantidadeCavalo;
     
   }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public int getQuantidadeCavalos() {
        return quantidadeCavalos;
    }

    public void setQuantidadeCavalos(int quantidadeCavalos) {
        this.quantidadeCavalos = quantidadeCavalos;
    }
   

     public double calcularIPVA(){
              return valorBase * quantidadeCavalos;
          }
     
     public String imprimir(){
          return "ValorBase:" + valorBase 
                    +",quantidadeCavalos" + quantidadeCavalos;
      }
    
     
     
     
     
     }
     
     








