// S�ntese Atividade 8
// Objetivo: Programa em Java que receba um valor e imprima se � positivo, negativo ou zero.
// Autor : Victor Edson da Cruz Homem 
// Data :25/08/2020

import java.util.Scanner;

public class Principal {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if(num<0)
			System.out.print("O n�mero � negativo");
		if(num>0)
		System.out.print("O n�mero � positivo");
		else 
			System.out.print("O n�mero � igual 0");
		
		scanner.close();
		}
}
