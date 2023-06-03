package com.mycompany.classe4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author latife.flcharanek
 */
public class LivroDeBiblioteca {
    String Editora;
    String Idioma;
    int idadeRecomendada;
    boolean emprestado;
    
    
    public String isEmprestado(){
        if(emprestado){
            return "O livro esta emprestado";      
         }
        else{
            return "O livro nao esta emprestado!";
        }
        
            
        
    }

    public String imprimir(){
        return  "Livro {" + " Editora = " + Editora + " Idioma = " + Idioma +  " idadeRecomendada = " + idadeRecomendada + '}';
                
                
} 
    
}
