/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula9;

/**
 *
 * @author latife.flcharanek
 */
public class Gerente extends Funcionario {
    
    private int numeroFuncionarios;
    
    
    public Gerente (){
        super();
    }
    
    public Gerente ( String nome, double salario, int numeroFuncionarios){
        super(nome,salario);
        this.numeroFuncionarios =numeroFuncionarios;
}
    
           public int  getnumeroFuncionarios(){
        return numeroFuncionarios;
    }
           
        public void setnumeroFuncionarios(int numeroFuncionarios){
        this.numeroFuncionarios= numeroFuncionarios;
    }
      
    @Override     
    public double aumentarSalario(double percentual){
              return super.aumentarSalario(percentual+ 20);
          }

    @Override
    public String imprimir(){
        return super.imprimir()+",numero funcionarios: " +numeroFuncionarios;
    }
    
}
