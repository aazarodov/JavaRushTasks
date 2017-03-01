package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int lengthSeq = 0, lengthCurrent = 0, currentDigital = 0;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            arrayList.add(Integer.parseInt(reader.readLine()));
            if (i == 0)
                currentDigital = arrayList.get(0);
            else if (currentDigital != arrayList.get(i)) {
                if (lengthSeq < lengthCurrent)
                    lengthSeq = lengthCurrent;
                currentDigital = arrayList.get(i);
                lengthCurrent = 0;
            }
            lengthCurrent++;
        }
        if (lengthSeq < lengthCurrent)
            lengthSeq = lengthCurrent;
        System.out.println(lengthSeq);
    }
}