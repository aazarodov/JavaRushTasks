package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> arrayStr = new ArrayList<String>();
        int indexShort = 0, indexLong = 0, lengthShort = 0, lengthLong = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            arrayStr.add(reader.readLine());
            if (i == 0) {
                lengthLong = arrayStr.get(i).length();
                lengthShort = lengthLong;
            } else {
                if (arrayStr.get(i).length() < lengthShort) {
                    lengthShort = arrayStr.get(i).length();
                    indexShort = i;
                } else if (arrayStr.get(i).length() > lengthLong) {
                    lengthLong = arrayStr.get(i).length();
                    indexLong = i;
                }
            }
        }
        if (indexLong < indexShort)
            System.out.println(arrayStr.get(indexLong));
        else
            System.out.println(arrayStr.get(indexShort));
    }
}
