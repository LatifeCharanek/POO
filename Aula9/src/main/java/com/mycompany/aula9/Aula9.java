/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula9;
import java.util.Scanner;

/**
 *
 * @author latife.flcharanek
 */
public class Aula9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome:");
        String nome = entrada.nextLine();
        System.out.println("Digite o salario");
        double salario = entrada.nextDouble();
        System.out.println("Digite o numero de funcionarios");
        int numeroFuncionarios = entrada.nextInt();
        
        Gerente jose = new Gerente (nome, salario, numeroFuncionarios);
        jose.aumentarSalario(18);
        System.out.println(jose.imprimir());
        
      
    }
}
