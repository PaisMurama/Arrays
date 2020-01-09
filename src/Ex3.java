import java.io.*;
public class Ex3 {
	public static void main(String[]args)throws IOException
	{
		excecutar();
	
	}

	public static void excecutar() throws IOException {
            
	int[] array = criarArray();
        
	visualizarArray(array);

				
		
	}
	
	
	
	public static void visualizarArray(int[] m) {
            
	for(int j=0;j<m.length;j++)
	{
		System.out.print(m[j]+";");
		
	}	
		
	}

	public static int[] criarArray() {
		
	int[] a = new int[50];
        
	int aux =101;
        
	for(int i=0;i<50;i++)
	{
		a[i]= aux;
                
		aux = aux+1;
		
      
		
	}		
	
		
		return a;
	}
	

	
}
