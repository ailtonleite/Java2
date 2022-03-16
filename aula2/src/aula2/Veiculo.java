package aula2;

public class Veiculo {
	private String modelo, marca;
	private double consumo;
	
	
	public Veiculo(String modelo, String marca, double consumo) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.consumo = consumo;
	}
	
	public void dadosVeiculo() {
		System.out.println("Modelo: "+ this.modelo);
		System.out.println("Marca: "+ this.marca);
	}
	
	public void consumoVeiculo() {
		System.out.println("Consumo: "+ this.consumo);
	}
}
