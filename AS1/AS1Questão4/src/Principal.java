// Síntese Atividade 4 
// Objetivo: Programa em Java que receba o preço do litro da gasolina e o valor que o motorista deseja
//abastecer, calcule e imprima a quantidade de litros correspondente a este valor.
// Autor : Victor Edson da Cruz Homem 
// Data :25/08/2020


import java.util.Scanner;

public class Principal {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual o preço do litro da gasolina: ");
		float gasolina = scanner.nextFloat();
		System.out.println("Qual o valor que deseja abastecer: ");
		float abas = scanner.nextFloat();
		float litros = (abas/gasolina);
		System.out.println("A quantidade de litros foi de:"+litros);
		scanner.close();
		
		
		
	}

}
