// Síntese Atividade 3
// Objetivo: Programa em Java que receba o valor total de uma compra e o valor pago pelo cliente, calcule e
//imprima o valor do troco.
// Autor : Victor Edson da Cruz Homem 
// Data :25/08/2020

import java.util.Scanner;

public class Principal {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o valor do produto: ");
		float valor = scanner.nextFloat();
		System.out.println("Digite o valor pago: ");
		float pago = scanner.nextFloat();
		float troco = valor-pago;
		System.out.println("O troco foi de: R$"+troco);
		scanner.close();
		
	}			

}
