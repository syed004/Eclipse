package com.bellinfo.consultancy.assignments.a678;

import java.util.Random;

public class StockPrice91 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] array = new int[30];
		for (int i = 0; i < 30; i++) {
			array[i] = rand.nextInt(100);
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			System.out.print("  ");
		}
		System.out.println("");
		int index1 = 40;
		int index2 = 40;
		int maxdiff = 0;
		System.out.println(array.length);
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {

				int a = array[j] - array[i];
				if (a > maxdiff) {
					maxdiff = a;
					index1 = i;
					index2 = j;
				}
			}
		}
		
		System.out.println("");
		System.out.println(maxdiff);
		System.out.println("buying at index " + (index1 + 1) + " and selling at index " + (index2 + 1)
				+ ", would give you the max price gain of " + maxdiff);

	}

}
