package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "";
        while (!(fileName = reader.readLine()).equals("exit"))
            new ReadThread(fileName).start();
        reader.close();
    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут
        @Override
        public void run() {
            try {
                Map<Integer, Integer> map = new HashMap<Integer, Integer>();
                FileInputStream file = new FileInputStream(fileName);
                while (file.available() > 0) {
                    int data = file.read();
                    if (!map.containsKey(data))
                    {
                        map.put(data, 1);
                    } else
                    {
                        map.put(data, map.get(data) + 1);
                    }
                }
                file.close();

                int maxCount = 0;
                int maxMetByte = 0;
                for (Map.Entry<Integer, Integer> pair : map.entrySet())
                {
                    if (maxCount < pair.getValue()){
                        maxCount = pair.getValue();
                        maxMetByte = pair.getKey();
                    }
                }
                synchronized (resultMap)
                {
                    resultMap.put(fileName, maxMetByte);
                }

            } catch (IOException e) {
            }
        }
    }
}
