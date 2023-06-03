/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classe.pkg1;

/**
 *
 * @author latife.flcharanek
 */
public class Classe1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       pessoa layla = new pessoa();
       layla.Nome= "layla";
       layla.Idade= 18;
       layla.Sexo= 'f';
       // System.out.println("Nome:" + layla.Nome);
       //  System.out.println("idade:" + layla.Idade);
       //  System.out.println("Sexo:" + layla.Sexo);
          
         System.out.println(layla.imprimir());
    }
   
          
   
}
