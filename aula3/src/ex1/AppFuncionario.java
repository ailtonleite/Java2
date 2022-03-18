package ex1;

public class AppFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Ailton Leite", 120, 36);
		
		funcionario.dados();
		double salario = funcionario.salario();
		System.out.println("Salário: R$ "+salario);
		
		Senior senior = new Senior("Luana", 90, 36, 10);
		senior.dados();
		double salarioSenior = senior.salario();
		System.out.println("Salário: R$ "+salarioSenior);
	}

}
