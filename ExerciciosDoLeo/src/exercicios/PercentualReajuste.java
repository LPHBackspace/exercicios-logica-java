package exercicios;

import java.util.Scanner;

public class PercentualReajuste {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		double salario_mensal, percentual, salario_reajustado;

		System.out.println("Digite seu sal�rio: ");
		salario_mensal = teclado.nextDouble();


		System.out.println("Informe o percentual de reajuste: ");
		percentual= teclado.nextDouble();

		salario_reajustado = salario_mensal + ((percentual/100)*salario_mensal);

		System.out.printf("O valor do sal�rio reajustado � R$ %.2f", salario_reajustado);



		}
}
