/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.classe4;

/**
 *
 * @author latife.flcharanek
 */
public class Classe4 {

    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca();
        livro.Editora ="Crivo";
        livro.Idioma= "Portugues";
        livro.idadeRecomendada= 15;
        livro.emprestado = false;
        
        
        System.out.println(livro.isEmprestado());
       
    }
}
