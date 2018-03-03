package com.bellinfo.consultancy.assignments.a678;

import java.util.HashMap;
import java.util.Set;

public class MOreThanOneDuplicate97 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9,1,2,3,4,5,6,6 };
		HashMap<Integer, Integer> hm1 = new HashMap<>();
		hm1.put(array[0], 1);
		for (int i = 1; i < array.length; i++) {
			int flag = 0;
			Set<Integer> set1 = hm1.keySet();
			for (Integer in : set1) {
				if (in == array[i]) {
					int a = hm1.get(in) + 1;
					hm1.put(in, a);
					flag = 1;
				}
			}
			if (flag == 0) {
				hm1.put(array[i], 1);
			}
		}
		Set<Integer> set2 = hm1.keySet();
		for(Integer in:set2){
			if(hm1.get(in)>1){
				System.out.println(in+" is repeated: "+hm1.get(in));
			}
		}
	}

}
