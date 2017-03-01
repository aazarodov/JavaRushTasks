package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader fRead = new FileReader(args[0]);
        BufferedReader reader = new BufferedReader(fRead);
        int[] asciiCounter = new int[Character.MAX_VALUE];
        String enter = "", str = "";
        while (reader.ready()) {
            str =  str + enter + reader.readLine();
            enter = "\n";
        }
        for (int i = 0; i < str.length(); i++) {
            asciiCounter[(int) str.charAt(i)]++;
        }
        for(int i = 0; i < asciiCounter.length; i++) {
            if(asciiCounter[i] > 0) {
                System.out.println((char)i + " " + asciiCounter[i]);
            }
        }
        reader.close();
        fRead.close();
    }
}
