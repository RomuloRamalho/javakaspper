package ex1ao10;

import java.util.Scanner;

public class Ex5 {
	
	
//	Ler um n�mero inteiro e exibir o seu sucessor.
	
	public static void main(String[] args) {
		
		
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.print("Digite o n�mero: ");
		  
	        int numero = sc.nextInt();
	        int sucessor = numero + 1;
	        
	        System.out.println("O sucessor �: " + sucessor);

	        sc.close();
	    }

		
	}


