
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
/*
Criar um array A com 10 elementos inteiros. Implementar um programa que defina e
escreva a quantidade de elementos armazenados neste vetor que são pares.
*/

public class Ex15 {
    public static void main(String[] args) {
        
        Scanner s= new Scanner(System.in);
        
        int contador = 0;
        
        int total = 2;
        
        int[]a = new int[total];
        
        System.out.println("Introduza numeros pares");
        
        for(int i = 0;i < total; i++)
        {
            a[i] = s.nextInt();
            if(a[i]%2==0)
            {
                contador++;
            
            }    
        
        }    
        
        System.out.println("A qtd de numeros pares:"+contador);
    }
    
}
