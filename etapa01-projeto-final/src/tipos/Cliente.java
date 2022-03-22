package tipos;

public class Cliente extends Pessoa {
	private String indereco;

	public Cliente(int codigo, String nome, String telefone, String indereco) {
		super(codigo, nome, telefone);
		this.indereco = indereco;
	}
	@Override
	public String toString() {
		return super.toString() + ": " + indereco;
	}
}
