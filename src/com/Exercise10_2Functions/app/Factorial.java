package com.Exercise10_2Functions.app;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		long factorial =1;
		int number =-1;
		
		Scanner input=new Scanner(System.in);
		
		
//////////////////////////////////////////////////////////////////
		//Validador de numeros positivos
		do
		{
			System.out.println("Numero para calcular el factorial: ");
			number=input.nextInt();
			
			if (number<=0)
			{
				System.out.println("Introduzca un valor positivo");
			}
			
			
		}while(number<=0);
		
		factorial =GiveFactorial(number);
		System.out.println("El factorial es: "+factorial);
		

	}
	
	////////////////////////////////////////////////////////////
	//Metodo para calcular el factorial
	
	public static long GiveFactorial(int n) {
		int factorial=1;
		
		for(int i=1;i<n;i++)
		{
			factorial=factorial*i;
		}
		return factorial;
	}

}
