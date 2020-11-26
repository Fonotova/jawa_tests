package com.company.Lesson11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        String path = "/Users/osukono/Downloads/maleName_out.txt" ;
        try {
          //  PrintWriter writer = new PrintWriter(new FileWriter(path))
            BufferedWriter writer =new BufferedWriter(new FileWriter(path));
            writer.write("Hello world");
            writer.newLine();
            writer.write("row2");
            writer.flush();// Вызвать в конце записывания в файл; выгружает из буфера данные в файл
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
