package exercicio01;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double salarioBruto, prestacao, valorLimite;
		System.out.println("Informe o valor do salário bruto");
		salarioBruto = teclado.nextDouble();
		System.out.println("Informe o valor da prestação");
		prestacao = teclado.nextDouble();
		valorLimite = salarioBruto * 0.3;
		if (prestacao <= valorLimite) {
			System.out.println("O impréstimo foi aprovado.");
		} else {
			System.out.println("O impréstimo não foi aprovado");
		}
	}
}
