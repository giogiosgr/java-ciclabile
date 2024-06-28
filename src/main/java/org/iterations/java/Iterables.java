package org.iterations.java;

public class Iterables {
	
	private int[] numbers;
	private int index;
	
	// costruttori
	public Iterables(int[] numbers) {
		this.numbers = numbers;
	}
	
	public Iterables() {
		this.numbers = new int[0];
	}
 
	// metodi principali
	public int getElementoSuccessivo() {
        int value = 0;
        if (this.index < numbers.length) {
        	value = numbers[index];
        	this.index++; 
        }
		return value;
	}
	
	public boolean hasAncoraElementi() {
		return (this.index < numbers.length);
	}
	
	/**
	 * Metodo Bonus
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
