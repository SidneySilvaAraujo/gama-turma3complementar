package exercicio02;

public class Relogio {
	private int hora;
	private int minuto;
	private int segundo;
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		if (hora <0 && hora > 23) {
			System.out.println("Valor inválido.");
		}
		this.hora = hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		if (minuto <0 && minuto > 59) {
			System.out.println("Valor inválido.");
		}
		this.minuto = minuto;
	}
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
		if (segundo < 0 && segundo > 59) {
			System.out.println("Valor inválido.");
		}
		this.segundo = segundo;
	}
	
}
