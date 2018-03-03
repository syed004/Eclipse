package com.bellinfo.consultancy.assignments.a678;

public class RepeatedIntArray92 {

	public static void main(String[] args) {
		int array[] = {6,4,5,7,3,6,4,7,6,2,9,6};
		int maxcount=0;
		int index=99;
		for(int i=0;i<array.length;i++){
			int count=1;
			for(int j=i+1;j<array.length;j++){
				if(array[i]==array[j]){
					count=count+1;
				}
			}
			if(maxcount<count){
				maxcount=count;
				index=i;
			}
		}
		System.out.println("number "+array[index]+" is repeated: "+maxcount+ " times.");
		

	}

}
