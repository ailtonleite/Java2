package ex1;

public class Senior extends Funcionario{
	private double bonus;

	public Senior(String nome, int horas, double valor, double bonus) {
		super(nome, horas, valor);
		this.bonus = bonus;
	}
	
	public void dados() {
		System.out.println("Nome: "+this.nome+ "\nHoras trabalhadas: "+this.horas+"\n");
	}
	
	public double salario() {
		int qtd = 0;
		for(int i = 10; i < this.horas; i+=10) {
			qtd++;
		}
		double bt = this.bonus * qtd;
		return (this.horas * this.valor)+bt;
	}
}
