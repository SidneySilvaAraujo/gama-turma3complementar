package etapa01;

public class Conta {
	private int numero;
	protected double saldo;
	public Conta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
		
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void dados() {
		System.out.println("Conta: " + numero + " saldo: " + saldo);
	}
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
}
