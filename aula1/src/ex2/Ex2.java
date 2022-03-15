package ex2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o salario: ");
		double salario = teclado.nextDouble();
		System.out.println("Informe a prestacao: ");
		double prestacao = teclado.nextDouble();
		
		double max = salario * 0.30;
		
		if(prestacao <= max) {
			System.out.println("Tudo ok!");
		} else {
			System.out.println("Valor ultrapassou!");
		}
				
		teclado.close();

	}

}
