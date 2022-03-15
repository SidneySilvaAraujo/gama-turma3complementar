package exercicio01;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("Informe um número.");
		numero = teclado.nextInt();
		for (int cont = 1; cont <= numero; cont++) {
			System.out.println(cont);
		}
	}
}
