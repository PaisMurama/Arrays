import java.io.*;
import java.util.Scanner;

//comentario de documentacao
/**
 * 
 * @author Pais Jose Murama
 * @author Jose Seie 
 */
public class Ex1 {
    
    public static void main(String[] args) throws IOException {
        /**
         * 1.ler nomes;
         * 2.ler notas de cada disciplina;
         * 3. calcular a media;
         * 4. imprimir;
         */
        Scanner s= new Scanner(System.in);
        
            int total =2;
            
            String nome; 
            
            int [] arrayMat;
            
            int [] arrayFisc;
            
            arrayMat = new int[total];
            
            arrayFisc = new int[total];
            
            double media[] = new double[total];
            
            
            
        
        for(int i=0;i<total;i++){
            
            System.out.println("Introduza o nome do "+(i)+" aluno");
        
            nome = s.next();
            
            System.out.println("Introduza a nota de matematica");
            arrayMat [i]= s.nextInt();
            
            System.out.println("Introduza a nota de Fisica!");
            arrayFisc[i] = s.nextInt();
          
            
            media[i]= arrayMat[i]*0.7+arrayFisc[i]*0.3;
             System.out.println("O valor da media eh:"+media[i]);
            
           
        }
        
        
        
        //System.out.println("O valor da media eh:"+media);
        
    }
        
   }
    
   