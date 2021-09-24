//EXERCÍCIO SOBRE CÁLCULO DE ÁREA

import java.util.Scanner;
import java.util.Locale;

public class Main{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("PROGRAMA PARA CALCULO DE AREA E PREÇO");
		
		System.out.println("Digite a largura");
		double largura = sc.nextDouble();
		
		System.out.println("Digite o comprimento");
		double comprimento = sc.nextDouble();
		
		double metro = 500;
		
		double area = largura * comprimento;
		
		double preco = area * metro;
		
		
		System.out.println("O resultado é");
		System.out.printf("Área = %.2f%n", area);
		System.out.printf("Preço = %.2f%n", preco);


		
	}
}
