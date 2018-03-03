package com.bellinfo.consultancy.assignments.a678;

import java.awt.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateChar93 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a word or line.");
	String line=scan.nextLine();
	char[] chars=line.toCharArray();
	HashSet<Character> hs1=new HashSet<>();
	for(int i=0;i<chars.length;i++){
		hs1.add(chars[i]);
	}
	HashMap<Character, Integer> hm1=new HashMap<>();
	hm1.put(chars[0], 1);
	for(int i=1;i<chars.length;i++){
		int flag=0;
		Set<Character> chs=hm1.keySet();
		for(Character chac:chs){
			if(chac==chars[i]){
				flag=1;
				int a=hm1.get(chac)+1;
				hm1.put(chac, a);
			}
		}
		if(flag==0){
			hm1.put(chars[i], 1);
		}
		
	}
	
	System.out.println(chars);
	System.out.println(hs1);
	System.out.println(hm1);
	
}
}
