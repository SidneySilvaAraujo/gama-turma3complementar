package exercicio01;

public class Principal {
	public static void main(String[] args) {
		Veiculo carro = new Veiculo("toiota", "coróla", 5.2);
		System.out.println("Modelo: " +carro.getModelo() + " Marca: " + carro.getMarca() + " conssumo: " + carro.getConsumo());
	}
}
