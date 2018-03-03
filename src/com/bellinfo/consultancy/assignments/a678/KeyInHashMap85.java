package com.bellinfo.consultancy.assignments.a678;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class KeyInHashMap85 {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("syed", "hamed");
		hm.put("hamed", "hamed");
		hm.put("hussain", "hamed");
		hm.put("naqvi", "hamed");
		hm.put("syed", "hussain");
		// System.out.println(hm);
	
		Set<String> keys = hm.keySet();
		for (String name : keys) {

			System.out.println(name + ":" + hm.get(name));
		}
		System.out.println("enter the String key to serch");
		Scanner scan = new Scanner(System.in);
		String comp = scan.nextLine();
		for (String name : keys) {
			if (name.equals(comp)) {
				System.out.println("********* key found********");
				System.out.println(name + ":" + hm.get(name));
			}
			else{
				System.out.println("****** key not found ************");
			}
		}
		System.out.println("*****************");
		System.out.println(" enter the vlave to serch");
		String val=scan.nextLine();
		for (String name : keys) {
			if (hm.get(name).equals(val)) {
				System.out.println("********* value  found********");
				System.out.println(name + ":" + hm.get(name));
			}
			
		}
		

	}

}
