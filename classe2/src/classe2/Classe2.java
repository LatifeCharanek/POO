/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classe2;

/**
 *
 * @author latife.flcharanek
 */
public class Classe2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lampada vendida = new Lampada();
        vendida.Cor = "Amarela";
        vendida.Formato = "Oval";
        vendida.Potencia = 4;
        
          System.out.println(vendida.imprimir());
    }
    
}
