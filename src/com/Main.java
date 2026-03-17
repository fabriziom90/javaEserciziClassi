package com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inserisci il primo numero");
		float x = scan.nextFloat();
		
		System.out.println("Inserisci il secondo numero");
		float y = scan.nextFloat();
		
		Calcolatrice calc = new Calcolatrice(x, y);
		
		System.out.println("Scegli l'operazione che vuoi effettuare");
		System.out.println("+ - Somma");
		System.out.println("- - Somma");
		System.out.println("* - Somma");
		System.out.println("/ - Somma");
		
		char op = scan.next().charAt(0);
		
		switch(op) {
			case '+':
				System.out.println("La somma dei due numeri è: "+calc.sum());
				break;
			case '-':
				System.out.println("La differenza dei due numeri è: "+calc.difference());
				break;
			case '*':
				System.out.println("La moltiplicazione dei due numeri è: "+calc.moltiplication());
				break;
			case '/':
				System.out.println("La divisione dei due numeri è: "+calc.division());
				break;
			
		}
		
		scan.close();
		
	}

}
