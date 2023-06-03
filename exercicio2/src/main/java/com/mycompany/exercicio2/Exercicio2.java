/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio2;
import java.util.Scanner;


/**
 *
 * @author latife.flcharanek
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero de algum mes");
        int num = entrada.nextInt();
        exibirMes(num);
        
    }
    static void exibirMes(int num){
            switch(num){
                case 1:
                    System.out.println("Janeiro");
                break;
                case 2:
                    System.out.println("Fevereiro");
                break;
                case 3:
                    System.out.println("Março");
                break;
                case 4:
                    System.out.println("Abril");
                break;
                case 5:
                    System.out.println("Maio");
                break;
                case 6:
                    System.out.println("Junho");
                break;
                case 7:
                    System.out.println("julho");
                break;
                  case 8:
                    System.out.println("Agosto");
                break;
                  case 9:
                    System.out.println("Setembro");
                break;
                  case 10:
                    System.out.println("Outubro");
                break;
                  case 11:
                    System.out.println("Novembro");
                break;
                  case 12:
                    System.out.println("Dezembro");
                break;
                  default:System.out.println("Numero invalido");
                
            }
        

        
        
        
    }
}
