package com.javarush.task.task08.task0818;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Афанасьев", 500);
        map.put("Богатырев", 350);
        map.put("Васильев", 1000);
        map.put("Голубев", 100);
        map.put("Демидов", 400);
        map.put("Ерастов", 600);
        map.put("Животов", 320);
        map.put("Зародов", 100000);
        map.put("Иванов", 5000);
        map.put("Петров", 800);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<String>();
        Integer salary;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            salary = entry.getValue();
            if (salary < 500)
                arrayList.add(entry.getKey());
        }
        for(String str : arrayList)
            map.remove(str);
    }

    public static void main(String[] args) {

    }
}