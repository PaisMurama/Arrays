import java.io.*;
public class Ex6 {
    public static void main(String[] args) throws IOException {
        char exame=0;
        int []array = new int[3];
        array = criarArray();
        visualizarArray(array);
        int []array2 = new int[3];
        array2= criarArray2(array);
         visualizarArray(array2);
        int []array3= new int[6];
        array3 = criarArray3(array,array2);
        visualizarArray(array3);
        
          
 
   }
    
    
      public static int[] criarArray() throws IOException {
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        int []a = new int[3];
        System.out.println("Introduza numeros inteiros");
        for(int i=0;i<3;i++)
        {
            a[i]=Integer.parseInt(p.readLine());
        }
        
       return a; 
    }

    
    public static void visualizarArray(int[] array) {
       for(int i=0;i<array.length;i++)
       {
           System.out.print(array[i]+";");
       }
    }

    public static int[] criarArray2(int[] array) {
     int []a = new int [3];
     int aux =1;
     for(int i=0;i<2;i++)
     {
       a[i]= aux;
       aux = aux+2;
       
     
     }   
        
        
        
        
        return a;
       
    }

    public static int[] criarArray3(int[] array, int[] array2) {
        int[]a =new int[6];
        for(int i=0;i<a.length;i++)
        {
          a[i]= array[i]+array2[i];
          
        }   
        
        
        return a;
       
    }
    
    
    
}
