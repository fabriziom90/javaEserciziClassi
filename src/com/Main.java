package com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("PRIMO ESERCIZIO: CALCOLATRICE");
		
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
			default:
				System.out.println("OPERAZIONE NON VALIDA");
				break;
			
		}
		
		System.out.println("SECONDO ESERCIZIO");
		
		System.out.println("Inserire la base");
		float base = scan.nextFloat();
		System.out.println("Inserire l'altezza");
		float height = scan.nextFloat();
		
		Rettangolo rettangolo = new Rettangolo(base, height);
		
		System.out.println("Il perimetro del rettangolo è: "+rettangolo.calculatePerimeter());
		System.out.println("L'area del rettangolo è: "+rettangolo.calculateArea());
		scan.close();
		
		ContoBancario contoUno = new ContoBancario(100);
		ContoBancario contoDue = new ContoBancario(-100);
		
		System.out.println(contoUno.getSaldo());
		System.out.println(contoDue.getSaldo());
		
		System.out.println("-----CONTO UNO-----");
		boolean depositContoUno = contoUno.deposita(-20);
		if(depositContoUno)
			System.out.println("Deposito effettuato. Il nuovo saldo è di: "+contoUno.getSaldo());
		else
			System.out.println("Deposito non effettuato. Inserito importo negativo");
			
		
		boolean prelievoContoUno = contoUno.preleva(500);
		
		if(prelievoContoUno)
			System.out.println("Prelievo effettuato. Il nuovo saldo è di: "+contoUno.getSaldo());
		else
			System.out.println("Prelievo non effettuato. Controlla il valore dell'importo da prelevare");
			
		
		System.out.println("-----CONTO DUE-----");
		boolean depositContoDue = contoDue.deposita(500);
		if(depositContoDue)
			System.out.println("Deposito effettuato. Il nuovo saldo è di: "+contoDue.getSaldo());
		else
			System.out.println("Deposito non effettuato. Inserito importo negativo");
			
		
		boolean prelievoContoDue = contoDue.preleva(100);
		
		if(prelievoContoDue)
			System.out.println("Prelievo effettuato. Il nuovo saldo è di: "+contoDue.getSaldo());
		else
			System.out.println("Prelievo non effettuato. Controlla il valore dell'importo da prelevare");
			
		
	}

}
