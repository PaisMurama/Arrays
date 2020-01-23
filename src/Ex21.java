
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
public class Ex21 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int total = 2;
        
         int []cod = new int[total];
         
        String [] nome = new String [total];
        
       
        for(int i=0; i < total ; i++)
        {
            System.out.println("Introduza o nome do explicador");
            
            nome[i] = s.next();     
        }
        
        System.out.println(""+Arrays.toString(nome));
        
       for(int i = 0 ; i < total ; i++)
       {
            System.out.println("Introduza o cod do explicador");
            
            cod[i] = s.nextInt();
         
       }
       
        System.out.println(""+Arrays.toString(cod));
        
      //consulta de nome atraves do cod;
      int codi = s.nextInt();
      int aux = 0;
      int pos=0;
      boolean encontrou = false;
      for(int i = 0; i < total && encontrou!=true ; i++ )
      {
          aux = cod[i];
          if(aux== codi)
          {
              pos =i;
              encontrou = true;
              
          }
          
          
        
      }
      
      
      String nome1 = s.next();
      for(int i = 0 ; i < total ; i++)
      {
          if(pos == -1)
          {
              System.out.println("Cod nao encontrado!");
          }
          else
          {
          if (nome1. equals (nome [i])){
                System.out.println(nome[i]);
              
            }
          
        }
          
          
      
      }    
      
       
        
        
       
        
        
        
        
        
        
    }
    
}
