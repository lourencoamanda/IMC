package application;

import java.util.Scanner;

import entites.Dados;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		Dados dados = new Dados(); 
					
		System.out.println("Informa altura: ");
		dados.altura = sc.nextDouble();

		System.out.println("Informa peso: " );
		dados.peso = sc.nextInt();
		
		dados.calculaImc(dados.altura, dados.peso);
			
		System.out.printf("Indice Massa Corporea = %.2f%n ", + dados.indiceMC );
		
		sc.close();
	}

}
