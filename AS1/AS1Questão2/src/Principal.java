// Síntese Atividade 2
// Objetivo: Programa em Java que leia o valor de uma determinada mercadoria de uma loja. Sabendo que o
//desconto para pagamento à vista é de 10% sobre o valor total, calcule o valor a ser pago à vista. Escreva o
//valor total, o valor do desconto e o valor a ser pago à vista.
// Autor : Victor Edson da Cruz Homem 
// Data :25/08/2020

import java.util.Scanner;

public class Principal {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o valor do produto: ");
		float valor = scanner.nextFloat();
		float pagamento = (valor * 0.9f);
		System.out.print("O valor com 10% de desconto para pagamento avista = R$"+pagamento);
		scanner.close();
		
	}

}
