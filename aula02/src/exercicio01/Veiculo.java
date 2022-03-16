package exercicio01;

public class Veiculo {
	private String modelo;
	private String marca;
	private double consumo;

	Veiculo(String modelo, String marca, double consumo) {
		this.marca = marca;
		this.modelo = modelo;
		this.consumo = consumo;
	}
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
}
