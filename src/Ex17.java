
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
 * Criar um array A com 8 elementos inteiros. Construir um array B de mesmo tipo e
tamanho e com os elementos do array A multiplicados por 2, ou seja: B[i] = A[i] * 2.
 */
public class Ex17 {
    public static void main(String[] args) {
        
        int total = 2;
        
        int []a = new int[total];
        
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
          b[i] = a[i]*2;
        }    
        System.out.println("O conteudo de b eh:"+Arrays.toString(b));
        
        
        
        
    }
    
}
