package aula1;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a nota 1: ");
		double n1 = teclado.nextDouble();
		System.out.println("Digite a nota 2: ");
		double n2 = teclado.nextDouble();
		
		double media = (n1 + n2)/2;
		System.out.println("A média do aluno é: "+media);
				
		teclado.close();
	}

}
