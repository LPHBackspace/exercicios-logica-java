package exercicios;

/**
 * Exerc�cio 6:
 * Criar um programa que leia um n�mero qualquer e retorno seu sucessor
 */

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Descobir o n�mero sucessor");
		
		System.out.println("Digite um n�mero");
		
		int valor1=sc.nextInt();
		
		int suc= valor1 + 1;
		
		System.out.println("O n�mero que vem ap�s " + valor1 + " �: " + suc);
		
		sc.close();
	}

}
