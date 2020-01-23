
import java.util.Scanner;


/**
 *
 * @author Moz SENO
 */
public class Ex9 {
    
    public static void main(String[] args) {
        int n = 3;
        
        int[]a = new int[n];
        
        int soma =0;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduza numeros inteiros");
        
        for(int i=0;i<n;i++)
        {
            a[i] = s.nextInt();
            //System.out.println("array geral"+a[i]);
            
            if(a[i]%5==0)
            {    
               // System.out.println("O conteudo do array :"+a[i]);    
                soma+= a[i];
            }
            
        }
      
        System.out.println("O valor da soma eh"+soma);
        
        
    }
    
    
}
