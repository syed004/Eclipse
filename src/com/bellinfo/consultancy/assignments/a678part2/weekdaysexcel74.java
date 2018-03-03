package com.bellinfo.consultancy.assignments.a678part2;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class weekdaysexcel74 {

	public static void main(String[] args) {

		String filename = System.getProperty("user.dir") + File.separator + "abcd.xls";

		WritableWorkbook workbook;
		try {
			workbook = Workbook.createWorkbook(new File(filename));
			WritableSheet writablesheet1 = workbook.createSheet("Sheet1", 0);
		//	WritableSheet writablesheet2 = workbook.createSheet("Sheet2", 1);
			//WritableSheet writablesheet3 = workbook.createSheet("Sheet3", 2);
			Label label1 = new Label(0, 0, "Week");
			Label label2 = new Label(0, 1, "Monday");
			Label label3 = new Label(0, 2, "Tuesday");
			Label label4 = new Label(0, 3, "Wednesday");
			Label label5 = new Label(0, 4, "Thusday");
			Label label6 = new Label(0, 5, "Friday");
			Label label7 = new Label(0, 6, "Saturday");
			Label label8 = new Label(0, 7, "Sunday");
			writablesheet1.addCell(label8);
			writablesheet1.addCell(label1);
			writablesheet1.addCell(label2);
			writablesheet1.addCell(label3);
			writablesheet1.addCell(label4);
			writablesheet1.addCell(label5);
			writablesheet1.addCell(label6);
			writablesheet1.addCell(label7);
			workbook.write();
			workbook.close();
		} catch (IOException | WriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
