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
		
		/////////////////////////////////////
		//se asigna la funcion de factorial a la variable
		factorial =GiveFactorial(number);
		//System.out.println("El factorial del numero "+number+" es "+factorial+"\nya que se a multiplicado por el numero por sí mismo");
		System.out.println(String.format("The format of %d is: %d, which is gotten by multipling several times %d", number,factorial,number));

	}
	
	////////////////////////////////////////////////////////////
	//Metodo para calcular el factorial
	
	public static long GiveFactorial(int n) {
		int factorial=1;
		
		for(int i=1;i<=n;i++)
		{
			factorial=factorial*i;
		}
		return factorial;
	}

}
