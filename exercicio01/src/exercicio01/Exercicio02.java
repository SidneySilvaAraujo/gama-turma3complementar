package exercicio01;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double salarioBruto, prestacao, valorLimite;
		System.out.println("Informe o valor do sal�rio bruto");
		salarioBruto = teclado.nextDouble();
		System.out.println("Informe o valor da presta��o");
		prestacao = teclado.nextDouble();
		valorLimite = salarioBruto * 0.3;
		if (prestacao <= valorLimite) {
			System.out.println("O impr�stimo foi aprovado.");
		} else {
			System.out.println("O impr�stimo n�o foi aprovado");
		}
	}
}
