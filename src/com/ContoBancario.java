package com;

public class ContoBancario {
    private double saldo;

    // Costruttore: inizializza il saldo (se negativo, lo imposta a 0)
    public ContoBancario(double saldoIniziale) {
        //TO DO 
        this.saldo = saldoIniziale;
        
        if(this.saldo < 0){
            this.saldo = 0;
        }
        
        
    }

    // Metodo per depositare denaro (solo valori positivi)
    public boolean deposita(double importo) {
        //TO DO 
    	
        if(importo < 0){
        	
            return false;
        }
        
        this.saldo += importo;
        return true;
    }

    // Metodo per prelevare denaro (se sufficiente, aggiorna il saldo)
    public boolean preleva(double importo) {
        //TO DO 
        if(importo > this.saldo || importo < 0){
            return false;
        }
        this.saldo -= importo;
        return true;
    }

    // Metodo per ottenere il saldo attuale
    public double getSaldo() {
        //TO DO 
        return this.saldo;
    }
}
