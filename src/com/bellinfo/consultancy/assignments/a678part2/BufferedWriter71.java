package com.bellinfo.consultancy.assignments.a678part2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter71 {

	public static void main(String[] args) {
		String pathname=System.getProperty("user.dir")+File.separator+"abcd.txt";
		File f1=new File(pathname);
		try {
			FileWriter fw1=new FileWriter(f1);
			BufferedWriter bf=new BufferedWriter(fw1);
			bf.write("this is another method to write\n");
			bf.flush();
			bf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
