package etapa01;

public class ContaEspecial extends Conta{
	private double limite = 500;
	public double getLimite() {
		return limite;
	}
	public ContaEspecial(int numero, double saldo) {
		super(numero, saldo);
	}
	@Override
	public boolean saca(double valor) {
		if (saldo + limite <= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
		
	}
}
