package exercicio01;

public class Funcionario {
	private String nome;
	private double horasTrabalhadas;
	private double salarioHora;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}

	public double cauculo(double horasTrabalhadas, double salarioHora) {
		double total = 0;
		total = this.horasTrabalhadas * this.salarioHora;
		return total;
	}

	public void imprime() {
		System.out.println("Nome" + nome);
		System.out.println("Salário por horas trabalhadas: " + salarioHora);
		System.out.println("Horas trabalhadas: " + horasTrabalhadas);
	}
}
