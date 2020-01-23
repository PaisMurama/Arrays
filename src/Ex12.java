import java.io.*;
import java.util.Scanner;
public class Ex12 {
	public static void main(String[]args)throws IOException
	{
		Scanner s = new Scanner(System.in);
		
		int total = 2;
		
		int [] a = new int [total];

		 int soma =0;
		System.out.println("Introduza os "+total+" valores inteiros");
		
		for(int i=0;i<total;i++)
		{
			a[i] = s.nextInt();
			
			soma+= a[i];
			
						
		}
		
		if(soma<15)
		{
			System.out.println("A soma dos elementos do array sao inferiores a 15");
		}
		else {
			
		if(soma==15)
		{	
		 System.out.println("A soma e igual a 15");
		}else
			{
			 
			System.out.println("A soma e superior a 15");
			
			}
		
	    }
		
		// A media so e calculada para elementos dos arrays superiores a 15
		int media = soma/total;
		if(media>15)
		{
			System.out.println("A media dos elementos do array que sao  superiores a 15 eh:"+media);
		}	
	
		
	
	}

	
	

	
	
	
	
	
}	