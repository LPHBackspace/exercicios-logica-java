package exercicios;

/**
 * Exerc�cio 5:
 * Criar um programa que leia um n�mero qualquer e retorno seu antecessor
 */

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Descobir o n�mero anterior");
		
		System.out.println("Digite um n�mero");
		
		int valor1=sc.nextInt();
		
		int ant= valor1 - 1;
		
		System.out.println("O n�mero que antecede " + valor1 + " �: " + ant);
		
		sc.close();
	}

}
