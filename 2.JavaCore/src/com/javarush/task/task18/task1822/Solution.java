package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fRead = new FileReader(reader.readLine());
        BufferedReader readerFile = new BufferedReader(fRead);
        String str;
        int id = Integer.parseInt(args[0]);
        while ((str = readerFile.readLine()) != null) {
            String temp = str.split(" ")[0];
            if (Integer.parseInt(temp) == id ) {
                System.out.println(str);
            }
        }
        reader.close();
        readerFile.close();
        fRead.close();
    }
}
