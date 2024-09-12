package fundamentos;

import java.util.Scanner;

public class dentro {

	
	public static void main(String[] args) {
		
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.printf("Digite seu nome: ");
			String nome = entrada.nextLine();
			
			System.out.printf("Digite seu sobrenome: ");
			String sobrenome = entrada.nextLine();
			
			System.out.print("Digite sua idade: ");
			int idade = entrada.nextInt();
			
			
			System.out.printf("O senhor(a) %s %s tem %d anos", nome, sobrenome, idade );
			
			entrada.close();
		}
	} 
}
