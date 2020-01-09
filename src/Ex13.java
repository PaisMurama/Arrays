import java.io.*;
import java.util.Scanner;
public class Ex13 {
	public static void main(String[]args)throws IOException
	{
		
		Scanner s = new Scanner(System.in);
		
		int contador = 0;
		
		int total =2;
		
		int []idade = new int[total];
		
		System.out.println("Introduza a idade !");
		
		for(int i=0;i<total;i++)
		{
			idade[i] = s.nextInt();
			
			if(idade[i]>35)
			{
				contador++;
				
			}	
			
		}	
		
		System.out.println("O numero de pessoas que possuem idade superior a 35 anos eh de :"+contador);
		
	
		
	
	}

	
	

	
	
	
	
	
}	