package exercicios;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		int soma = 0;
		while (true) {
			System.out.println("Digite um n�mero.");
			numero = teclado.nextInt();
			soma += numero;
			if (numero == 0) {
				break;
			}
		}
		System.out.println("o n�mero 0 foi informado, a soma de todos os n�meros informados �: " + soma);
	}
}
