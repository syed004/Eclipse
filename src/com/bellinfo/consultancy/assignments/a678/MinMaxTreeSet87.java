package com.bellinfo.consultancy.assignments.a678;

import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class MinMaxTreeSet87 {
	public static void main(String[] args) {
		TreeMap<Integer, Integer> tm = new TreeMap<>();
		Random rand = new Random();
		for (int i = 0; i < 5; i++) {
			tm.put(rand.nextInt(100), rand.nextInt(50));
		}
		System.out.println(" lowest key has value is: "+tm.firstKey());
		System.out.println(" highest key has value is:  "+tm.lastKey());
		Set<Integer> set=tm.keySet();
		for(Integer in:set){
			System.out.println("key: "+in+" value: "+tm.get(in));
		}
		
	}
}
