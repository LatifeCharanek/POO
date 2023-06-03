/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio4;
import java.util.Scanner;

/**
 *
 * @author latife.flcharanek
 */
public class Exercicio4 {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero ");
        int num = entrada.nextInt();
        boolean valor = isPar(num);
        System.out.println(valor);
        
    }
    static boolean isPar(int num){
        if(num%2==0){
            return true;
        }else{
            return false;
        }
        
 
    
    }
}
