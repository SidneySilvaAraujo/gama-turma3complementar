package exercicio01;

import java.util.Scanner;

/*Faça um programa que leia duas notas de um aluno, calcule e mostre a média aritmética do aluno.*/

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double n1, n2, media;
		System.out.println("Digite a primeira nota do aluno.");
		n1 = teclado.nextDouble();
		System.out.println("Digite a segunda nota do aluno.");
		n2 = teclado.nextDouble();
		media = (n1 + n2) / 2;
		System.out.println("A média do aluno, é: " + media);
	}
}
