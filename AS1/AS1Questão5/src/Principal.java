// S�ntese Atividade 5
// Objetivo: Programa em Java que receba um n�mero inteiro, verifique e imprima se este n�mero � par ou
//�mpar.
// Autor : Victor Edson da Cruz Homem 
// Data :25/08/2020

import java.util.Scanner;

public class Principal {
	public static void main (String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o numero inteiro: ");
		int num = scanner.nextInt();
		if (num % 2 == 0)
			System.out.print("N�mero par!");
		else 
			System.out.print("N�mero �mpar");
		scanner.close();
	}
	
}
