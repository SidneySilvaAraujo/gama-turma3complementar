package tipos;

public class Pessoa {
	private int codigo;
	private String nome;
	private String telefone;
	public Pessoa(int codigo, String nome, String telefone) {
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public String toString() {
		return codigo + " - " + nome + " (" + telefone + ")";
	}
}
