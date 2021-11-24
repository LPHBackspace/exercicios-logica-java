package exercicios;

/**
 * Exerc�cio 8:
 * Criar um programa que leia a base e a altura de um tri�ngulo e retorne o valor de sua �rea
 */

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String[]args) {
		
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Calcular �rea de um tri�ngulo");
	
	System.out.println("Digite a base do tri�ngulo");
	
	int base=sc.nextInt();
	
	System.out.println("Digite a altura do tri�ngulo");
	
	int alt=sc.nextInt();
	
	int area= (base * alt) / 2;
	
	System.out.println("A �rea do respectivo tri�ngulo � igual �: " + area);
	
	sc.close();
	}
}
