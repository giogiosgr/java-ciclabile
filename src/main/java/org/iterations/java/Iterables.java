package org.iterations.java;

public class Iterables {
	
	int[] numbers;
	int index;
	
	public Iterables(int[] numbers) {
		this.numbers = numbers;
	}
	
	public Iterables() {
		this.numbers = new int[0];
	}

	public int getElementoSuccessivo() {
		int storedValue = numbers[index];
        if (this.index < numbers.length) this.index++; 
		return storedValue;
	}
	
	public boolean hasAncoraElementi() {
		return (this.index < numbers.length);
	}
	
	
}
