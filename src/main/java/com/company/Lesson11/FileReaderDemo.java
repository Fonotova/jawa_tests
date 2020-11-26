package com.company.Lesson11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

public class FileReaderDemo {
    public static void main(String[] args) {
       // String path = "/Users/osukono/Downloads/maleName.txt" ;
       // String path = args [0];
        Properties properties = new Properties();
        try(InputStream is = FileReaderDemo.class.getClassLoader().getResourceAsStream("demo.properties")) {
            properties.load(is); // загружаем пропертя из файла "demo.properties"
        } catch (IOException e) {
            e.printStackTrace();
        }
       //String path =System.getProperty("path.in");
        String path = properties.getProperty("path.in"); // читаем проперти по ключу
        try {
            Scanner scanner = new Scanner(new FileInputStream(path));
            while (scanner.hasNext()) {
                String row = scanner.nextLine();
                System.out.println(row);
               // scanner.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println(("Error" + path));
            e.printStackTrace();
        }
    }
}
