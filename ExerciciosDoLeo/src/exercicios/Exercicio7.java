package exercicios;

/**
 * Exerc�cio 7:
 * Criar um programa que leia a base e a largura de um ret�ngulo e retorne o valor de sua �rea
 */

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calcular a �rea de um ret�ngulo");
		
		System.out.println("Digite a altura do ret�ngulo");
		
		int alt=sc.nextInt();
		
		System.out.println("Digite a base do ret�ngulo");
		
		int base=sc.nextInt();
		
		int area= base * alt;
		
		System.out.println("A �rea do retangulo �: " + area);
		
		sc.close();
	}
}
