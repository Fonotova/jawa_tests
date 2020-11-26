package com.company.Lesson11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class ExcelWriteDemo {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("/Users/osukono/Downloads/maleName.xlsx");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // Workbook workbook = new SXSSFWorkbook();
      //  Sheet sheet = workbook.createSheet();
      //  Row row = sheet.createRow(0);

    }
}
