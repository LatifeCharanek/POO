/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula2;

/**
 *
 * @author latife.flcharanek
 */
public class Aula2 {

    public static void main(String[] args) {
        System.out.println("Este é meu primeiro método em Java");
        exibirAsteristico();
        System.out.println("Fiz uma chamada ao método exibirAsteristico()");
        exibirAsteristico();
        System.out.println("Fiz outra chamada!");
      
               
    }
     static void exibirAsteristico(){
        for (int cont=0; cont< 50; cont++ ){
            System.out.print("*");
       }
     }
}
