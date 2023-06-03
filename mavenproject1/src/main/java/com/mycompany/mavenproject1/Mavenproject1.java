/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author latife.flcharanek
 */
public class Mavenproject1 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor:");
        double valorBase = entrada.nextDouble();
        System.out.println("Digite a quantidade de cavalos");
        int quantidadeCavalos = entrada.nextInt();
        System.out.println("Digite a quantidade de eixos");
        int quantidadeEixos = entrada.nextInt();
      
        
        
        
   
        IPVAcaminhao caminhao = new IPVAcaminhao(valorBase, quantidadeCavalos,quantidadeEixos);
         System.out.println(caminhao.imprimir());
          
        
     
    }
    }

