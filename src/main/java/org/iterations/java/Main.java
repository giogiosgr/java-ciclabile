package org.iterations.java;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
         
		// istanza del primo oggetto con nuovo array di interi passato come parametro
        Iterables listaInteri = new Iterables(new int[]{1,4,33,99,2});
        
        // estraiamo un po' di elementi
        System.out.println(listaInteri.getElementoSuccessivo());
        System.out.println(listaInteri.getElementoSuccessivo());
        System.out.println(listaInteri.getElementoSuccessivo());
        
        // verifichiamo che ci siano ancora elementi
        System.out.println(listaInteri.hasAncoraElementi());
        
        // estraiamo altri elementi
        System.out.println(listaInteri.getElementoSuccessivo());
        System.out.println(listaInteri.getElementoSuccessivo());
        
        // a questo punto non avremo nuovi elementi da ricavare
        System.out.println(listaInteri.hasAncoraElementi());
        
        // quindi ogni chiamata al metodo getElemento restituisce sempre 0
        System.out.println(listaInteri.getElementoSuccessivo());
        System.out.println(listaInteri.getElementoSuccessivo());
        
        // istanza del secondo oggetto, questa volta senza parametri
        Iterables secondaLista = new Iterables();
        
        // inizialmente non avrà elementi
        System.out.println(secondaLista.hasAncoraElementi());
        
        // aggiungiamo un elemento
        secondaLista.addElemento(8);
             
        // adesso l'array di interi avrà elementi non ancora estratti
        System.out.println(secondaLista.hasAncoraElementi());
        
        // aggiungiamo qualche elemento
        secondaLista.addElemento(160);
        secondaLista.addElemento(3);
        secondaLista.addElemento(55);
        
        // stampiamo la nuova lista di interi
        System.out.println(Arrays.toString(secondaLista.getNumbers()));
        
        // estraiamo elementi in uguale numero alle aggiunte
        System.out.println(secondaLista.getElementoSuccessivo());
        System.out.println(secondaLista.getElementoSuccessivo());
        System.out.println(secondaLista.getElementoSuccessivo());
        System.out.println(secondaLista.getElementoSuccessivo());
        
        // a che punto è l'indice?
        System.out.println("Indice: " + secondaLista.getIndex());
        
        // a questo punto non avremo più elementi da mostrare
        System.out.println(secondaLista.hasAncoraElementi());
        
    }
	
}
