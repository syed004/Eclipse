package com.bellinfo.consultancy.assignments.a678;

import java.util.HashMap;
import java.util.Set;

public class VowelsConsonentsrepeation96 {
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
		HashMap<String, Integer> hm2 = new HashMap<>();
		hm2.put("vowels", 0);
		hm2.put("consonents", 0);
		System.out.println(hm);
		Set<Character> charset = hm.keySet();
		for (Character ch : charset) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				int value2 = hm2.get("vowels");
				int value = hm.get(ch) + value2;
				hm2.put("vowels", value);
			} else {
				int value2 = hm2.get("consonents");
				int value = hm.get(ch) + value2;
				hm2.put("consonents", value);
			}
		}
		System.out.println(hm2);

	}
}
