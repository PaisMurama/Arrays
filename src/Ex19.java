
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Moz SENO
 */
/**
 * 
 * Criar dois arrays A e B cada um com 10 elementos inteiros. 
 * Construir um array C, onde cada elemento de C é a divisão dos respectivos elementos em A e B, ou seja: C[i] = A[i] / float(B[i]).
 */
public class Ex19 {
    public static void main(String[] args) {
        int total = 2;
        
        int [] a = new int[total];
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduza numeros pares");
        for(int i = 0; i<total ; i++)
        {
            a[i] = s.nextInt(); 
        
        }    
        System.out.println("O conteudo de a eh:"+Arrays.toString(a));
        
        int [] b = new int[total];
        
        
        for(int i=0; i< total;i++)
        {
          b[i] = a[i];
        }    
        System.out.println("O conteudo de b eh:"+Arrays.toString(b));
        
        int [] c  = new int[total];
        
        for(int i = 0 ;i < total; i++)
        {
            c[i] =  (int) (a[i]/(float)b[i]); 
        
        }    
        
        System.out.println("O conteudo de c eh;"+Arrays.toString(c));
        
        
    }
    
        
        
    }
    


