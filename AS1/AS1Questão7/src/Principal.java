// S�ntese Atividade 7
// Objetivo: Programa em Java que receba a velocidade de um motorista na rodovia.
// Autor : Victor Edson da Cruz Homem 
// Data :25/08/2020

import java.util.Scanner;

public class Principal {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite a velocidade do veiculo: ");
		int quant = scanner.nextInt();
		if(quant>80)
		System.out.print("O USU�RIO ULTRAPASSOU A VELOCIDADE M�XIMA E SER� MULTADO");
		else
			System.out.print("O USU�RIO EST� DENTRO DO LIMITE M�XIMO DE VELOCIDADE.");
		scanner.close();
		
	}

}
