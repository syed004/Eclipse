package com.bellinfo.consultancy.assignments.a678part2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NoOfWords72 {

	public static void main(String[] args) {
		String pathname = System.getProperty("user.dir") + File.separator + "abcd.txt";
		String text = null;
		int words = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(pathname));
			while ((text = br.readLine()) != null) {
				String[] wordinline = text.split(" ");
				words = words + wordinline.length;
				System.out.println(text);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("no of words are: " + words);
	}

}
