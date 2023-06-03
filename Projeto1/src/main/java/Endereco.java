/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author latife.flcharanek
 */
public class Endereco {
       private String logradouro;
    private String complemento;
    private int numero;
    private String cep;
    
    public String imprimir(){
        return "Logradouro: "+logradouro+
                "\nComplemento"+complemento+
                "\n Numero: "+numero+
                "\n CEP: "+cep;
}
}