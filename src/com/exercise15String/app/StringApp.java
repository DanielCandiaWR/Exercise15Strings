package com.exercise15String.app;
import com.exercise15String.model.Tuneador;
public class StringApp {

	public static void main(String[] args) {
		String input = "aabaa";
		// TODO Auto-generated method stub
		String chain = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi accumsan rhoncus nulla, at sodales ligula accumsan quis. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aenean mauris ante, molestie eget gravida a, vulputate malesuada est. Vestibulum at nibh vel mi dictum pharetra eget eget arcu. Morbi sapien tortor, elementum id semper eu, vulputate id lectus. Nam quis pharetra ante, quis dignissim purus. Proin nec ligula nec ligula egestas suscipit. Mauris turpis turpis, vulputate sit amet pellentesque in, dictum ac felis.";
		String chain2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi accumsan rhoncus nulla, at sodales ligula accumsan quis. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aenean mauris ante, molestie eget gravida a, vulputate malesuada est. Vestibulum at nibh vel mi dictum pharetra eget eget arcu. Morbi sapien tortor, elementum id semper eu, vulputate id lectus. Nam quis pharetra ante, quis dignissim purus. Proin nec ligula nec ligula egestas suscipit. Mauris turpis turpis, vulputate sit amet pellentesque in, dictum ac felis.";

		System.out.println(chain.charAt(3));
		System.out.println(chain.codePointAt(3));
		System.out.println(chain.codePointBefore(3));
		System.out.println(chain.codePointCount(3,4));		
		//Algorithm for reversing string
		String reversedString = "";
		for(int index=input.length()-1;index>=0;index--) {
			reversedString = reversedString+input.charAt(index);
		}
		System.out.println(reversedString);
		System.out.println("Equals? "+input.equals(reversedString));
		//Strings in vectors
		String[] myChains = {chain,chain2,input};
		String[] myNewChains = Tuneador.tunea(myChains);
		for(int i=0;i<myNewChains.length;i++) {
			System.out.println(myNewChains[i]);
		}
		int[] myArray = {1,2,4,6,7,8,9,2,12,34,56,78,99};
		System.out.println(Tuneador.mediaVector(myArray));
	}

}
