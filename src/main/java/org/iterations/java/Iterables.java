package org.iterations.java;

public class Iterables {
	
	private int[] numbers;
	private int index;
	
	/**
	 * Costruttore con parametro
	 * 
	 * @param array di interi
	 */
	public Iterables(int[] numbers) {
		this.numbers = numbers;
	}
	
	/**
	 * Costruttore senza parametro che inizializza l'array come vuoto
	 */
	public Iterables() {
		this.numbers = new int[0];
	}
 
	/**
	 * Metodo che restituisce l'elemento successivo
	 * 
	 * @return nuovo intero
	 */
	public int getElementoSuccessivo() {
        int value = 0;
        if (this.index < numbers.length) {
        	value = numbers[index];
        	this.index++; 
        }
		return value;
	}
	
	/**
	 * Metodo che indica se abbiam stampato tutti gli elementi o meno
	 * 
	 * @return true/false
	 */
	public boolean hasAncoraElementi() {
		return this.index < numbers.length;
	}
	
	/**
	 * Metodo Bonus per l'aggiunta di un elemento
	 * 
	 * @param newNumber
	 */
	public void addElemento(int newNumber) {
		int[] newNumbers = new int[this.numbers.length + 1];
		for (int i = 0; i < numbers.length; i++) {
			newNumbers[i] = numbers[i];
		}
		newNumbers[numbers.length] = newNumber;
		this.numbers = newNumbers;
	}
	
    /**
     * Getter che restituisce l'array
     * 
     * @return array di interi
     */
    public int[] getNumbers() {
		return this.numbers;
	}
    
    /**
     * Getter che restituisce l'indice
     * 
     * @return indice
     */
    public int getIndex() {
    	return this.index;
    }
}
