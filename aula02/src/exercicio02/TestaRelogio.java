package exercicio02;

public class TestaRelogio {
	public static void main(String[] args) {
		Relogio relogio = new Relogio();
		relogio.setHora(15);
		relogio.setMinuto(35);
		relogio.setSegundo(0);
		System.out.println("No momento, são: " + relogio.getHora() + " horas, " +relogio.getMinuto() + " minutos, e " + relogio.getSegundo() + " segundos!");
	}
}
