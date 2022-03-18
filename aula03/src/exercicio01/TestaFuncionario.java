package exercicio01;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setNome("João");
		f1.setHorasTrabalhadas(6);
		f1.setSalarioHora(200);
		f1.imprime();
			System.out.println(f1.cauculo(f1.getSalarioHora(), f1.getHorasTrabalhadas()));
		
	}
}
