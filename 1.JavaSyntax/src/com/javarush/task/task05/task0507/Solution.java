package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int sum = 0, count = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String temp;
        temp = reader.readLine();
        while (!temp.equals("-1")) {
            sum = sum + Integer.parseInt(temp);
            count++;
            temp = reader.readLine();
        }
        if (count > 0)
            System.out.println((double) sum / count);
        else
            System.out.println(0);
        reader.close();
    }
}

