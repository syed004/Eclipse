package com.bellinfo.consultancy.assignments.a678;

import java.util.HashMap;
import java.util.Set;

public class FirstNonRepeated95 {

	public static void main(String[] args) {
		String s1 = "Ramsamkamdamyumnum";
		char[] chars = s1.toLowerCase().toCharArray();
		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i] + " ");
		}
		System.out.println();
		HashMap<Character, Integer> hm = new HashMap<>();
		hm.put(chars[0], 1);
		for (int i = 1; i < chars.length; i++) {
			int flag = 0;
			Set<Character> charset = hm.keySet();
			for (Character ch : charset) {
				if (ch == chars[i]) {
					int a = hm.get(ch) + 1;
					hm.put(ch, a);
					flag = 1;
				}
			}
			if (flag == 0) {
				hm.put(chars[i], 1);
			}
		}
		System.out.println(hm);
		Set<Character> keysets = hm.keySet();
		int flag=0; 
		for (int i = 0; i < chars.length; i++) {
			for (Character chare : keysets) {
				
				if((chare==chars[i])&&(hm.get(chare)==1)&&(flag==0)){
					System.out.println(chare+" is first non repeated character.");
					flag=1;
				}

			}
		}
	}

}
