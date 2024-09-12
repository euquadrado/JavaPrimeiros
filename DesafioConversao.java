package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o Primeiro Salário: ");
		String v1 = entrada.next().replace("," , ".");
		
		System.out.print("\nDigite o Primeiro Salário: ");
		String v2 = entrada.next().replace("," , ".");
		
		System.out.print("\nDigite o Primeiro Salário: ");
		String v3 = entrada.next().replace("," , ".");
		
		double n1 = Double.parseDouble(v1);
		double n2 = Double.parseDouble(v2);
		double n3 = Double.parseDouble(v3);
		
		double media = (n1 + n2 + n3) / 3;
		
		System.out.println("A média dos Salários é: " +  media );
		
		entrada.close();
	}
}
