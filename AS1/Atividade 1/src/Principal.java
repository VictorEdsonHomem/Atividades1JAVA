// Síntese Atividade 1
// Objetivo: Celsius para Farenheit
// Autor : Victor Edson da Cruz Homem 
// Data :25/08/2020

import java.util.Scanner;

public class Principal {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite a temperatura em Celsius");
		float Celsius = scanner.nextFloat();
		float Farenheit = ((Celsius * 9) / 5) + 32;
		System.out.print("A temperatura em Farenheit = " + Farenheit);
		scanner.close();
	}

}
