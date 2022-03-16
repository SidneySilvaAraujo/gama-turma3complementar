package exercicios;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		System.out.println("Digite um número.");
		numero = teclado.nextInt();
		for (int cont = 0; cont <= 10; cont++) {
			System.out.println(numero + " x " + cont + " = " + cont * numero);
		}
	}
}
