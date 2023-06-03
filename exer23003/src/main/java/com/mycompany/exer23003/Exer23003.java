/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exer23003;

/**
 *
 * @author latife.flcharanek
 */
public class Exer23003 {

   public static void main(String[] args) {
		int[]vetorInteiros = {10, 20, 30, 40, 50};
		
		for(int i=0; i < vetorInteiros.length; i++) {
			System.out.println(vetorInteiros[i]+ "  ");
		}
		modificar(vetorInteiros);
		
		System.out.println("\n=== Vetor após chamada do método ===");
		for(int i=0; i < vetorInteiros.length; i++) {
			System.out.println(vetorInteiros[i]+ "  ");
		}
				
	}//fim do main
	
	static void modificar(int []vetor) {
		for(int i = 0 ; i < vetor.length; i++) {
			vetor[i] = vetor [i];
		}
	}

}
