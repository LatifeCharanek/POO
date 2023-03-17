package com.mycompany.ex2;
import java.util.Scanner;

/**
 *
 * @author latife.flcharanek
 */
public class Ex2 {

    public static void main(String[] args) {
       int[] vetor = new int [10];
       int i = 0;     
       int slot= 0;

       
       do{      
           if(i % 2 ==1 ){
               vetor[slot] = i; 
               slot++;
        }
        i++;
       }while(slot <10);
       

       for(i=0; i <vetor.length;i++ ){
           System.out.println(vetor[i]);
       
   
       }
       }
}
