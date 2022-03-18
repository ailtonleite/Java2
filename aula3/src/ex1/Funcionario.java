package ex1;

public class Funcionario {
	protected String nome;
	protected int horas;
	protected double valor;
	
	public Funcionario(String nome, int horas, double valor) {
		super();
		if (horas < 0 || valor < 0) {
			System.out.println("Verifique se os valores informados são maiores que 0!");
		}
		this.nome = nome;
		this.horas = horas;
		this.valor = valor;
	}
	
	public void dados() {
		System.out.println("Nome: "+this.nome+ "\nHoras trabalhadas: "+this.horas+"\n");
	}
	
	public double salario() {
		return this.horas * this.valor;
	}
	
	
}
