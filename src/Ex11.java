
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Moz SENO
 */
public class Ex11 {
    public static void main(String[] args) throws IOException {
        int [] array = new int[10];
        
        int par=0, impar=0;
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Introduza numeros pares");
        for(int i=0;i<array.length;i++)
        {
           array[i] = Integer.parseInt(p.readLine());
           
           
           if(array[i]%2==0)
           {
             par++;
           }else   
           {
               impar++;
           } 
           
           
   
        }
        System.out.println(Arrays.toString(array));
         System.out.println("Percent de pares: " + par*10 + "%");
        System.out.println("Percent de Impares: " +impar*10 + "%");
        
    }
    
}
