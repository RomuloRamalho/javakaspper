package ex1ao10;

import java.util.Scanner;

public class Ex5 {
	
	
//	Ler um número inteiro e exibir o seu sucessor.
	
	public static void main(String[] args) {
		
		
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.print("Digite o número: ");
		  
	        int numero = sc.nextInt();
	        int sucessor = numero + 1;
	        
	        System.out.println("O sucessor é: " + sucessor);

	        sc.close();
	    }

		
	}


