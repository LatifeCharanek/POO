/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apphero;
import java.util.ArrayList;

/**
 *
 * @author latife.flcharanek
 */
public class ListaDeHerois {
    private static ArrayList<Hero>listaHero = new ArrayList<>();
    
    //Get da lista Herois 
    public static ArrayList<Hero>getListaHero(){
        return listaHero;
    }
    //Metodo para adicionar Heroi no fim da lista 
    static void adicionar(Hero h){
        listaHero.add(h);
    }
    //Metodo para adicionar Heroi na posiçao especifica 
    static void adicionar(Hero h, int index){
        listaHero.add(index,h);
    }
    //Metodo para listar herois cadastrados na lista 
    static String listar(){
        String saida = "";
        for (Hero h : listaHero)
            saida += h.imprimir() + "\n";
        return saida;
        
    }
    //Metodo para buscar elemento no vetor - indexOf
    static int buscarElemento(Hero hero){
        //compara a referencia do objeto 
        return listaHero.indexOf(hero);
    }
    //Metodo para buscar objeto pelo "poder"
    static Hero buscarElemento(String poder){
        for(Hero h :listaHero){
            if(h.getPoder().equalsIgnoreCase(poder))
                return h;    
        }
        return null;
    }
    //metodo para remover heroi pelo indice
    static void remover(int index){
        listaHero.remove(index);
    }
}
