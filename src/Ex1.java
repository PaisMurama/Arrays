import java.io.*;
// juntei com exercicio 4
public class Ex1 {
    public static void main(String[] args) throws IOException {
        char exame=0;
        int []array = new int[10];
        array = criarArray();
        visualizarArray(array);
        int []array2 = new int[10];
        array2= criarArray2(array);
         visualizarArray(array2);
        
        float media =0;
        media = calCular(array);
        
          
 
   }
    
   
    public static int[] criarArray() throws IOException {
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        int []a = new int[10];
        System.out.println("Introduza numeros inteiros");
        for(int i=0;i<a.length;i++)
        {
            a[i]=Integer.parseInt(p.readLine());
        }
        
       return a; 
    }

    public static float calCular(int[] array) {
        float m = 0;
        for(int i=0;i<array.length;i++)
        {
         m+= array[i];
        }  
        
       return m/10; 
        
    }

    public static void visualizarArray(int[] array) {
       for(int i=0;i<array.length;i++)
       {
           System.out.print(array[i]+";");
       }
    }

    public static int[] criarArray2(int[] array) {
     int []a = new int [10];
     for(int i=0;i<a.length;i++)
     {
       a[i]= array[i];
     
     }   
        
        
        
        
        return a;
       
    }
    
    
}
    
    

