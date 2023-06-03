/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author latife.flcharanek
 */
public class Pessoa {
     //atributos
    private String nome;
    private int idade;
    private char sexo;
    private Endereco end;
    
    
    public String imprimir(){
        return "Nome: "+nome + 
                "\n Idade: "+idade+
                "\n Sexo: "+sexo+
                "Endereço: "+end.imprimir();
    }
}



