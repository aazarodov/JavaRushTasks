package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean sorted = true;
        int length = 0, index = 0;
        for (int i = 0; i < 10; i++) {
            arrayList.add(reader.readLine());
            if (sorted)
                if (length > arrayList.get(i).length()) {
                    sorted = false;
                    index = i;
                }
                else
                    length =  arrayList.get(i).length();
        }
        if (!sorted)
            System.out.println(index);
    }
}

