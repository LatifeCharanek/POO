/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author latife.flcharanek
 */
public class IPVAcaminhao extends IPVA {
    
     private int quantidadeEixos;
    
     
     //public IPVAcaminhao(){
         //super();
     //}
     
      public IPVAcaminhao(double valorBase, int quantidadeCavalos, int quantidadeEixos){
          super(valorBase,quantidadeCavalos);
          this.quantidadeEixos= quantidadeEixos; 
     }
       public int  getquantidadeEixos(){
        return quantidadeEixos;
    }
        public void setquantidadeEixos(int quantidadeEixos){
        this.quantidadeEixos= quantidadeEixos;
        }
        
        @Override
    public String imprimir(){
        return super.imprimir()+",quantidade de Eixos: " +quantidadeEixos;
    }
    
     @Override
     public double calcularIPVA(){
              return super.calcularIPVA() * quantidadeEixos;
          }
     
    
}
