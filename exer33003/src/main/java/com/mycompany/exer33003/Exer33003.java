/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exer33003;
import java.util.Scanner;

/**
 *
 * @author latife.flcharanek
 */
public class Exer33003 {

    public static void main(String[] args) {
        int []vetor = {9};
        lerVetor(vetor);
        int somatorio = somarNumeros(vetor);
            
    }
    static void lerVetor(int vetor[]){
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite um numero ");
         
        
        for (int i = 0; i<vetor.length; i++){
             vetor[i] = entrada.nextInt();
        }
    }
     static int somarNumero(int[] vetor){
          int somatorio = 0;
          for (int i = 0; i<vetor.length;i++){
              somatorio = somatorio+vetor[i];
          
            
        }
              return somatorio;
     }

     static double calcularMedia(int[]vetor){
          int somatorio = 0;
          for (int i = 0; i<vetor.length;i++){
              somatorio = somatorio+vetor[i];
        }
          return somatorio / (double)vetor.length;
    }
}
         
        
    


         




    

