package exercicios;

/**
 * ELEI��O OSASCO
 * Escreva um algoritmo para ler o n�mero total de eleitores de um munic�pio, o n�mero de votos 
 * brancos, nulos e v�lidos. Calcular e escrever o percentual que cada um representa em rela��o ao total 
 * de eleitores. 
 */

import java.util.Scanner;

public class VotosdoLeo {

	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Votos na cidade de Osasco");
		
		System.out.println("Digite o n�mero de eleitores na cidade");
		
		double total=sc.nextDouble();
		
		System.out.println("Digite o n�mero de votos em branco");
		
		double brancos=sc.nextDouble();
		
		System.out.println("Digite o n�mero de votos nulos");
		
		double nulos=sc.nextDouble();
		
		System.out.println("Digite o numero de votos validos");
		
		double validos=sc.nextDouble();
		
		double percentualA= (brancos / total) * 100;
		double percentualB= (nulos / total) * 100;
		double percentualC= (validos / total) * 100;
		
		System.out.println("Total de votos em branco: " + percentualA + "%; Total de votos nulos: " + percentualB + "%; Total votos validos:" + percentualC + "%.");
		
		sc.close();
	}
}