// Síntese Atividade 10
// Objetivo: Programa em Java que receba o nome do cliente e o valor das suas compras no
//ano passado e calcule um bônus de 15% quando o valor for R$ 500.000,00, ou mais, ou 10% para outros
//casos.
//o valor inicial e imprima o número de meses necessários. 
// Autor : Victor Edson da Cruz Homem 
// Data :25/08/2020

import java.util.Scanner;

public class Principal {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in); 
		int i;
		
		for(i=0;i<150;i++) {
			System.out.print("Digite o nome do cliente:  ");
		String nomeCliente = scanner.next();
		if(nomeCliente == "fim")
			break; 
		else 
			System.out.print("Digite o valor das compras:  ");
		float valor = scanner.nextFloat();
		if(valor<500000)
			System.out.println("Você recebeu um bonus no valor de: R$ "+valor*0.10f);
		else 
			System.out.println("Você recebeu um bonus no valor de: R$ "+valor*0.15f);
		}
		scanner.close();
	}
}
