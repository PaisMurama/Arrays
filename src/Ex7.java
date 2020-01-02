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
public class Ex7 {
    public static void main(String[]args) throws IOException
    {
        int []arrayA = new int[10];
        arrayA = criarArray();
        int[]arrayB = new int[10];
        arrayB = criarArray();
        visualizarArray(arrayB);
        int []arrayC = new int[arrayB.length];
        arrayC = criarArrayC(arrayA,arrayB);
        visualizarArrayC(arrayC);
        
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

    public static int[] criarArrayC(int[] a, int[] b) {
        int c [] = new int[a.length];
        for(int i=0;i<c.length;i++)
        {
            c [i] = a[i]+b[i];
          
         
        }    
        
     return c;
       
 
    
 }

    public static void visualizarArrayC(int[] arra) {
         for(int i=0;i<arra.length;i++)
      {  
        System.out.print(arra[i]+";");
      }


       
    }
    



}