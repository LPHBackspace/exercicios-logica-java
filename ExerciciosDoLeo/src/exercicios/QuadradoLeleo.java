package exercicios;

/**
 * Quadrado do leo:
 * Criar um programa que leia o quadrado do leo
 */

import java.util.Scanner;

public class QuadradoLeleo {

	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Calcular �rea de um quadrado");
		
		System.out.println("Digite o valor do lado do quadrado em centimetros");
		
		int lado=sc.nextInt();
		
		int area= lado * lado;
		
		System.out.println("A �rea do quadrado do l�o � igual �: " + area + "cm�");
		
		sc.close();
	}
}
