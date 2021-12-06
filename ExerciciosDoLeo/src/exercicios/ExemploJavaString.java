package exercicios;

import java.util.Locale;

public class ExemploJavaString {

    public static void main(String[]args){

        String saudacao= "Boa tarde";

        System.out.println(saudacao);

        // Contagem do número de caracteres

        System.out.println("A quantidade de caracteres da palavra é: " + saudacao.length());

        // deixar a frase minuscula
        System.out.println(saudacao.toLowerCase());

        // deixar a frase maiuscula
        System.out.println(saudacao.toUpperCase());

        // localizar palavra
        String frase = "Os ultimos serão os primeiros";

        System.out.println(frase.indexOf("ultimos"));

        // descobrir o maior valor ou menor valor
        System.out.println(Math.max(48,14));
        System.out.println(Math.min(48,14));

        // raiz quadrada
        System.out.println(Math.sqrt(225));

        // tirar o valor negativo
        System.out.println(Math.abs(-12));

        // Gerar numeros aleatórios
        int numeroRandomico = (int)(Math.random()*101);
        System.out.println(numeroRandomico);
    }
}
