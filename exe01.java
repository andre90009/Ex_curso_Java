//FAZER UM PROGRAMA PARA LER UM NÚMERO INTEIRO, E DEPOIS DIZER SE ESTE NÚMERO É NEGATIVO OU NÃO

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		x = sc.nextInt();
		
		
		if (x < 0)
			{
			 System.out.println("NEGATIVO");
			}
			
		else
		{
			System.out.println("NÃO NEGATIVO");
		}

		sc.close();
		
	}
}
