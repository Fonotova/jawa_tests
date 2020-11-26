package com.company.Lesson11;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReaderDemo {
    public static void main(String[] args) {
        String path = "/Users/osukono/Downloads/maleName.txt";
        try(FileInputStream is = new FileInputStream(path)){
            Workbook workbook = new XSSFWorkbook(is);
            Sheet sheet = workbook.getSheet("sheet-demo");

            //Row row = row.getRow(0);
           // Cell cell1 = row.getCell(0);
            //System.out.println((cell1.getStringCellValue()));

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
