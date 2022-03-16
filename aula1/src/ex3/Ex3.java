package ex3;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		System.out.println("Digite um numero: ");
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		for(int i = 1; i<=n; i++) {
			System.out.println(i);
		}
		teclado.close();
	}
	
}
