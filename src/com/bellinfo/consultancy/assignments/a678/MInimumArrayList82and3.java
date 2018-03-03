package com.bellinfo.consultancy.assignments.a678;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class MInimumArrayList82and3 {
	public static void main(String[] args) {
		//ArrayList<Integer> al = new ArrayList<>();
		HashSet<Integer> al=new HashSet<>();
		Random ran = new Random();
		for (int i = 0; i < 10; i++) {
			int a = ran.nextInt(100);
			al.add(a);
		}
		System.out.println("***********");
		System.out.println(al);
		//Collections.sort(al);
		System.out.println(Collections.min(al));
		//System.out.println("the minimum no is: " + al.get(0));
		int temp = 100;
		for (Integer a : al) {
			if (a < temp) {
				temp = a;
			}
		}
		System.out.println("using other method the minvalue is: " + temp);
	}
}
