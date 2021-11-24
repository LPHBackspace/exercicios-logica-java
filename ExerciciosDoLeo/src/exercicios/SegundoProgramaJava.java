package exercicios;

import java.util.Scanner;

public class SegundoProgramaJava {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");
		
		int valor=sc.nextInt();
		
		System.out.println("Digite um valor:");
		
		int valor2=sc.nextInt();
		
		int soma= valor + valor2;
		
		System.out.println("A soma dos valores correspondentes �: " + soma);
		
		sc.close();
		/*Coment�rios em Java
		Coment�rio Multi Linhas
		3 formas de Coment�rios em Java*/ 
		
		// Comet�rio inline
				
		/**Classe = Classifica��o Alunos
		 * Coment�rio Multi Linha Para Documenta��o
		 * aperte enter aqui para testar -> */
	}
}
