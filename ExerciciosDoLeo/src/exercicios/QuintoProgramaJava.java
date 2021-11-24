package exercicios;

import java.util.Scanner;

public class QuintoProgramaJava {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Efetuar divis�o");
		
		System.out.println("Digite o primeiro n�mero");
		
		int valor1=sc.nextInt();
		
		System.out.println("Digite o segundo n�mero");
		
		int valor2=sc.nextInt();
		
		int divi= valor1 / valor2;
		
		System.out.println("O valor da divis�o " + valor1 + " � " + valor2 + " = " + divi);
		
		sc.close();
	}
}
