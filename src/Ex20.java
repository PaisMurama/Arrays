
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
public class Ex20 {
    
    public static void main(String[] args) {
        
      Scanner s =  new Scanner(System.in);
          
        int total;
 
        System.out.println("Informe a Quantidade de Alunos q serão Cadastrados");
        total= s.nextInt();
 
        String[] nome = new String[total];
        
        nome = criarArray(total);
        
        visualizarArray(nome);
        
        int pos = localizar(nome,total);
        
        if(pos == -1)
        {
            System.out.println("O nome nao existe");
           
        }
        else
        {
           System.out.println(nome[pos]); 
        
        }
        
        
       
        
        
            
        
        
        
         
            }    

    public static String[] criarArray(int total) {
     String [] a = new String [total];
     
     Scanner s = new Scanner(System.in);
     
     
     for(int i = 0;i < total ; i++)
     {
          a[i] = s.next();
     }
     
     return a;
     
    }

    public static void visualizarArray(String[] nome) {
       System.out.println("O conteudo do array eh:"+Arrays.toString(nome));
    }

    public static int localizar(String[] nome, int total) {
        Scanner s = new Scanner(System.in);
        String nomeProcurado = s.next();
        String aux ="";
        int posAux=0;
        boolean encontrou = false;
        for(int i = 0; i < total && encontrou!=true ; i++ )
        {
            aux = nome[i];
            
            if(aux.equals(nomeProcurado))
            {
                posAux =i;
                encontrou = true;
            
            }    
        
        }
        
        return posAux;
        
    }
                
            
            
             
    
    
}
