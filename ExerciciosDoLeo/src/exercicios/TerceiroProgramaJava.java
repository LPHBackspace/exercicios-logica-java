package exercicios;

import java.util.Scanner;

public class TerceiroProgramaJava {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero da subtra��o");
		
		int valor1=sc.nextInt();
		
		System.out.println("Digite o segundo n�mero da subtra��o");
		
		int valor2=sc.nextInt();
		
		int subtracao= valor1 - valor2;
		
		System.out.println("O resultado da opera��o " + valor1 + " - " + valor2 + " = " + subtracao);
		sc.close();
	}

}
