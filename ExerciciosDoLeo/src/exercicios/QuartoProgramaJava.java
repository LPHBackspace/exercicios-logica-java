package exercicios;

import java.util.Scanner;

public class QuartoProgramaJava {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Efetuar Multiplica��o");
		
		System.out.println("Digite o primeiro n�mero");
		
		int valor1=sc.nextInt();
		
		System.out.println("Digite o segundo n�mero");
		
		int valor2=sc.nextInt();
		
		int mult= valor1 * valor2;
		
		System.out.println("O valor da opera��o= " + valor1 + " x " + valor2 + " = " + mult);
		
		sc.close();
	}

}
