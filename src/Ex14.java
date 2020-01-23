/**
 *
 * @author Moz SENO
 */
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class Ex14 {
    public static void main(String[] args) {
        
        
        int total =2;
        
        int[] idade= new int[total];
        
        idade = criarArray(total);
        
        visualizarArray(idade);
        
        int maior;
        
        maior = acharMaior(idade);
        
        System.out.println("O maior valor eh:"+maior);
        
        int menor;
        
        menor = acharMenor(idade);
        
        System.out.println("O menor valor eh:"+menor);
       
            
                
        }

    public static int[] criarArray(int total) {
        int [] a = new int[total];
         
        Scanner s = new Scanner(System.in);
        System.out.println("Introduza a idade");
        for(int i=0;i<total;i++)
        {
            a[i] = s.nextInt();
           
         
        }
        
       
        return a;
        
    }

    public static void visualizarArray(int[] idade) {
        System.out.println(Arrays.toString(idade));
        
    }

    public static int acharMaior(int[] idade) {
        int aux =0;
        
        for(int i=0;i<idade.length;i++)
        {
            if(idade[i]>aux)
            aux = idade[i];
        }    
        
        return aux;
   
    }

    public static int acharMenor(int[] idade) {
        int aux = 1000;
        
        for(int i=0;i<idade.length;i++)
        {
            if(idade[i]<aux)
            aux = idade[i];    
        } 
        
        return aux;
    }
    



}

    