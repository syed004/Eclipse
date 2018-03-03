package com.bellinfo.consultancy.assignments.a678part2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ReplaceWord73 {

	public static void main(String[] args) {
		String pathname = System.getProperty("user.dir") + File.separator + "abcd.txt";
		String text = null;
		ArrayList<String> lines = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(pathname));
			
			while ((text = br.readLine()) != null) {
				String ln = "";				String[] wordinline = text.split(" ");

				for (int i = 0; i < wordinline.length; i++) {
					if (wordinline[i].equals("another")) {
						wordinline[i] = "overided";
					}

					ln = ln + " " + wordinline[i];

				}
				
				lines.add(ln);
			}
			System.out.println(lines);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File f1 = new File(pathname);
		try {
			FileWriter fw1 = new FileWriter(f1);
			BufferedWriter bf = new BufferedWriter(fw1);
			for (int i = 0; i < lines.size(); i++) {
				bf.write(lines.get(i));
				bf.newLine();
				//System.out.println(lines.get(i));
			}
			bf.flush();
			bf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
