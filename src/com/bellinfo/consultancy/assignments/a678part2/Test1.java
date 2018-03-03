package com.bellinfo.consultancy.assignments.a678part2;

import java.util.HashMap;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		int[] array = { 1, 9, 7, 3, 9, 4, 7, 7, 1, 10, 3, 1,1};
		HashMap<Integer, Integer> hm = new HashMap<>();
		hm.put(array[0], 1);
		for (int i = 1; i < array.length; i++) {
			int flag = 0;
			Set<Integer> values = hm.keySet();
			for (Integer in : values) {
				if (in == array[i]) {
					int a = hm.get(in) + 1;
					hm.put(array[i], a);
					flag = 1;
				} 
			}
			if (flag == 0) {
				hm.put(array[i], 1);
			}
		}
		
		System.out.println(hm);
		Set<Integer> values1=hm.keySet();
		for(Integer in1:values1){
			System.out.println(in1*hm.get(in1));
		}
	}

}
