import java.io.*;
public class Ex10 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
        int n = 3;
        
        int []a = new int [n];
        int soma =0;
        
        float media ;
        
        int contImpar=0;
        
        System.out.println("Introduza os numeros inteiros ");
        
        for(int i=0;i<n;i++)
        {
            a[i] = Integer.parseInt(p.readLine());
            
            if(a[i]%2!=0)
            {
               contImpar++;
               soma=soma + a[i]; 
           
            }    
            
            
            
            
            
         
        }    
        
        System.out.println("A quantidade de numeros impares eh:"+contImpar);
        media = soma/contImpar;
        
        System.out.println("O valor da media eh:"+media);
        
        
        
        
    }
    
}
