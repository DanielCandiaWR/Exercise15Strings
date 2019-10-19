package com.exercise15String.model;

public class Tuneador {
	public static String[] tunea(String[] chains) {
		for(int i=0;i<chains.length;i++) {
			chains[i] = chains[i].trim();
			chains[i] = chains[i].toLowerCase();
			chains[i] = chains[i].replace('a', 'o');
			chains[i] = chains[i].replace('e', 'o');
			chains[i] = chains[i].replace('i', 'o');
			chains[i] = chains[i].replace('o', 'o');
		}
		
		return chains;
	}
	public static double mediaVector(int[] myArray) {
		int suma = 0;
		for(int i=0;i<myArray.length;i++) {
			suma = suma+myArray[i];
		}
		return suma/myArray.length;
	}
}
