/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.apphero;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author latife.flcharanek
 */
public class AppHero {
    

 public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);

ArrayList<Hero>listaHero = new ArrayList<>();

//cria 4 objetos no tipo Hero
Hero hero1 = new Hero("homem-aranha","escalar paredes");
Hero hero2 = new Hero("hulk","super força");
Hero hero3 = new Hero("superman","super força");
Hero hero4 = new Hero ("wolverine","super força");

//grava no arraylist
ListaDeHerois.adicionar(hero1);
ListaDeHerois.adicionar(hero2);
ListaDeHerois.adicionar(hero3);
ListaDeHerois.adicionar(hero4);

System.out.println("==== HEROIS CADASTRADOS ====");
System.out.println(ListaDeHerois.listar());
System.out.println("===INSERE UM HEROI NA POSIÇAO ESPECIFICA(posição 1===");
Hero hero5 = new Hero ("batman","voar");
ListaDeHerois.adicionar(hero5);
System.out.println("Após o novo cadastro");
System.out.println(ListaDeHerois.listar());

System.out.println("===USO DO get(int index)===");
System.out.println("Heroi cadastrado na posição:" + (1)+""+ listaHero.get(1).getNome());

System.out.println("=== TOTAL DE HEROIS CADASTRADOS===");
System.out.println(listaHero.size());

System.out.println("===VERIFICA SE O ARRAY ESTÁ VAZIO===");
if(listaHero.isEmpty()){
    System.out.println("Array vazio!");
}else{
    System.out.println("Tem elementos cadastrados");
}
 System.out.println("===USO DO indexOf(Object o)===!");
 System.out.println("Está no indice:" + buscarElemento(listaHero,hero5));
 
 System.out.println("===BUSCA OBJETO PELO PODER: super força===");
 Hero h = buscarElemento(listaHero, "super força");
 System.out.println(h.imprimir);
 
 System.out.println("===REMOVER OBJETO PELO ÍNDICE (posição 0)===");
 removerHero(listaHero,0);
 System.out.println(ListaDeHerois.listar());
 
 
 }
}


 
