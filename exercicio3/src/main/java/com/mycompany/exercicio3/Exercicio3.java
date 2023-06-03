/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio3;
import java.util.Scanner;

/**
 *
 * @author latife.flcharanek
 */
public class Exercicio3 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite dois números");
        int numero1= entrada.nextInt();
        int numero2= entrada.nextInt();
        
        int maiorNumero =encontrarMax (numero1,numero2);
        System.out.println("O maior numero é"+ maiorNumero);  
    }
    static int encontrarMax(int numero1,int numero2){
        int maior;
        if(numero1>numero2){
            maior=numero1;
        }else{
            maior= numero2;
        }
        return maior;
    }
    }

            



