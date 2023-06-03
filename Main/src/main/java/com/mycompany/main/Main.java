/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;

/**
 *
 * @author latife.flcharanek
 */
public class Main {

          public static void main(String[] args) {
       // FormaGeometrica forma = new FormaGeometrica();
        Circulo circulo = new Circulo("circulo", 24.3);
        Quadrado quadrado = new Quadrado("quadrado",14.2);
        System.out.printf(circulo.imprimir());
        System.out.printf(quadrado.imprimir());
        
       
          }
        
    }
