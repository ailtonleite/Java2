package ex2;

public class AppPlacar {
	public static void main(String[] args) {
		Placar placar = new Placar();
		Placar placarInicial = new Placar("S�o paulo", "Palmeiras");
		Placar placarFinal = new Placar("S�o paulo", "Palmeiras", 2, 1);
		placarInicial.mostrarPlacar();
		placarFinal.mostrarPlacar();
	}
}
