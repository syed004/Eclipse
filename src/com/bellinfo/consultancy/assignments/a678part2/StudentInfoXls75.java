package com.bellinfo.consultancy.assignments.a678part2;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class StudentInfoXls75 {

	public static void main(String[] args) {
		String filename = System.getProperty("user.dir") + File.separator + "StudentInfo.xls";

		WritableWorkbook workbook;

		try {
			workbook = Workbook.createWorkbook(new File(filename));
			WritableSheet writablesheet1 = workbook.createSheet("Sheet1", 0);
			Label label1 = new Label(0, 0, "IDS");
			Label label2 = new Label(1, 0, "NAME");
			Label label3 = new Label(2, 0, "MARKS");
			Label label4 = new Label(3, 0, "FEE");
			writablesheet1.addCell(label1);
			writablesheet1.addCell(label2);
			writablesheet1.addCell(label3);
			writablesheet1.addCell(label4);
			workbook.write();
			workbook.close();
		} catch (IOException | WriteException e) {
			
			e.printStackTrace();
		}
		
		Student s1 = new Student(1, "Syed", 80, 6000.10);
		Student s2 = new Student(2, "Hamed", 86, 5900.20);
		Student s3 = new Student(3, "Hussain", 78, 5500.40);
		Student s4 = new Student(4, "Naqvi", 89, 5600.50);

	}

}

class Student {
	int id;
	String name;
	int marks;
	Double fee;

	public Student(int id, String name, int marks, Double fee) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.fee = fee;
	}

}