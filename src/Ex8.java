/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Moz SENO
 */
import java.io.*;
public class Ex8 {
    public static void main(String[]args) throws IOException
    {
        int []arrayA = new int[10];
        arrayA = criarArray();
        visualizarArray(arrayA);
        int soma = calcular(arrayA);
        System.out.println("O valor da soma eh:"+soma);
        
    }        
    
     public static int[] criarArray() throws IOException {
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        int []a = new int[10];
        
        System.out.println("Introduza numeros inteiros");
        for(int i=0;i<10;i++)
        {
            a[i]=Integer.parseInt(p.readLine());
        }
        
       return a; 
        
    }
     
     public static void visualizarArray(int[] ar) {
      for(int i=0;i<ar.length;i++)
      {  
        System.out.print(ar[i]+";");
      }

    
    
}

    public static int calcular(int[] arrayA) {
        int somar=0;
        for(int i=0;i<arrayA.length;i++)
        {
            somar =somar+ arrayA[i];
        }    
    
     return somar;
    }

}
