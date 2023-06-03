/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projeto1;
import java.util.Scanner;

/**
 *
 * @author latife.flcharanek
 * ex 1
 */
public class Projeto1 {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero");
        int acumulador =0;  
        int numero = entrada.nextInt();
        for (int i = 1; i <=numero ; i++) {
            acumulador = acumulador+i;
            System.out.println(acumulador);
        }
    }
}
