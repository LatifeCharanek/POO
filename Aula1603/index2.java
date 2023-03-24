//ex 1
package com.mycompany.procedimentoparametros2;

/**
 *
 * @author latife.flcharanek
 */
public class ProcedimentoParametros2 {

    public static void main(String[] args) {
        somar (10, 50);
    }
    static void somar (int n1, int n2){
        int resultado;
        resultado = n1 +n2;
        System.out.println("A soma é: " + resultado);
        
    }
}

//ex2
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

//ex3
package com.mycompany.exercicio3;
import java.util.Scanner;

/**
 *
 * @author latife.flcharanek
 */
public class Exercicio3 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite dois números");
        int numero1= entrada.nextInt();
        int numero2= entrada.nextInt();
        
        int maiorNumero =encontrarMax (numero1,numero2);
        System.out.println("O maior numero é"+ maiorNumero);  
    }
    static int encontrarMax(int numero1,int numero2){
        int maior;
        if(numero1>numero2){
            maior=numero1;
        }else{
            maior= numero2;
        }
        return maior;
    }
    }

//ex4
package com.mycompany.exercicio4;
import java.util.Scanner;

/**
 *
 * @author latife.flcharanek
 */
public class Exercicio4 {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero ");
        int num = entrada.nextInt();
        boolean valor = isPar(num);
        System.out.println(valor);
        
    }
    static boolean isPar(int num){
        if(num%2==0){
            return true;
        }else{
            return false;
        }
        
 
    
    }
}


