
import java.io.*;
import java.util.Random;

/*
 *@author Pais*
 */

public class Ex4 {
    public static void main(String[] args) throws IOException {
        
       menu();
      
        
    }
    
    public static void menu() throws IOException
    {
         
        int x = validarLinhaColuna("Introduza o numero de linhas e colunas ");
        
        int [][] a = new int[x][x];
        
        int linha = 0;
        
        int []b = new int[x];
        
        byte op=0;
        
        do
        {
        	
            
            System.out.println("1.Criar o array Bidimensional");
            System.out.println("2.Visualiazar o array Bidimensional");
            System.out.println("3.Escolher uma linha e copiar para um arrray unidmensional");
            System.out.println("4.Visualizar");
            System.out.println("5. Sair");
            op = validarByte("Introduza a opcao!",(byte) 1,(byte)5);
            
            switch(op){
                case 1 :{
                   a = criarArray(x);
                   
                 break;
                }
                case 2: 
                    visualizarArray(a);
                    break;
                
                case 3:
                    linha = validarLinha("Introduza a linha que pretende copiar",x);
                    b =criarArray1(a,linha);
                    break;
                 
                case 4:
                    visualizarArray1(b);
                    break;
                    
                case 5:
                   System.exit(0);
                 break;
            
            
            }
                    
            
            
        }while(op!=6);
        
        
        
        
        
        
      
    }        

    

    public static void visualizarArray1(int[] b) {
    	
		for(int i=0;i<b.length;i++)
		{
			System.out.print(";"+b[i]);
		}	
		
	}

	private static int[] criarArray1(int[][] a, int linha) {
		
		int []k = new int[a[0].length];
		
		for(int j=0;j<a.length;j++)
		{
			k [j] = a[linha-1][j];
		}	
    	
    	
    	
		return k;
	}

	public static int validarLinha(String str, int x) throws IOException {
    	int y=0;
    	
    	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    	
    	System.out.println(str);
    	do
    	{
    		y = Integer.parseInt(br.readLine());
    		if(y<x && y>x)
    		System.out.println("Erro!");	
    		
    	}while(y<x && y>x);
    	
    	
    	
		
		return y;
	}

	public static void visualizarArray(int[][] a) {
	  for(int i=0;i<a.length;i++)
	  {
		  for(int j=0;j<a[0].length;j++)
		  {
			  System.out.print(";"+a[i][j]);
		  }
		  
		  System.out.println();
	  }  
		
	}

	public static int[][] criarArray(int x) {

    	int[][] c=new int [x][x];
    	
    	Random r = new Random();
    	
    	for(int i=0;i<c.length;i++)
    	{
    		for(int j=0;j<c[0].length;j++)
    		{
    			c[i][j] =r.nextInt(10);     			
    		}	
    	}	
    	
		return c;
	}

	public static int validarLinhaColuna(String string) throws  IOException {
		
    	int x=0;
    	
    	BufferedReader p =new BufferedReader(new InputStreamReader(System.in));
    	
    	System.out.println(string);
    	do
    	{
    		x = Integer.parseInt(p.readLine());
    		if(x<0)
    		{
    			System.out.print("Erro!");
    		}
    		
    		
    	}while(x<0);
    	
		return x;
	}

	public static byte validarByte(String ms, byte b, byte c) throws IOException {
       byte y = 0;
       
       BufferedReader p =new BufferedReader(new InputStreamReader(System.in));
       
       System.out.println(ms);
       do
       {
          y = Byte.parseByte(p.readLine());
          if(y<b||y>c)
        	  
               System.out.println("Erro!");    
       
       }while(y<b||y>c);
       
        return y;
    }

    
    
    
}
