/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula9;

/**
 *
 * @author latife.flcharanek
 */
public class Funcionario {
      private String nome;
      private double salario;
      
   //contrutor
      public Funcionario(){
      
      }
      
      public Funcionario(String nome, double salario){
          this.nome = nome;
          this.salario = salario;
      
      } 
      public double aumentarSalario(double percentual){
          return this.salario = + salario*percentual/100;
      }
      
       public String getnome() {
        return nome;
    }
          public double getsalario() {
        return salario;
    }
              
       public void setsalario(double salario ) {
        this.salario= salario;
    }
     
        public void setnome(String nome ) {
        this.nome= nome;
    }
     
     
     
     // public String imprimir(){
      //    return "Salario" + salario +
           //       ",nome:" + nome;
      public String imprimir(){
          return "Nome:" + nome 
                    +",salario" + String.format("%.2f",salario);
      }
    
}
