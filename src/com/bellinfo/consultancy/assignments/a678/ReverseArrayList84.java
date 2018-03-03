package com.bellinfo.consultancy.assignments.a678;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ReverseArrayList84 {

	public static void main(String[] args) {
		Random rand = new Random();
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			int a = rand.nextInt(100);
			al.add(a);
		}
		
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);

	}

}
