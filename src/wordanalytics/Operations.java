/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordanalytics;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Operations {
       public static LinkedHashMap search(LinkedHashMap<String, Integer> map) {
        LinkedHashMap<String, Integer> search = new LinkedHashMap<String, Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the words you want to search");
        String userword = scan.nextLine();

        String Userarr[] = userword.split("\\,");

        for (String string : Userarr) {

            string = string.toLowerCase();
            for (Map.Entry<String, Integer> item : map.entrySet()) {
                if (item.getKey().compareTo(string) == 0) {
                  
                    search.put(item.getKey(), item.getValue());
                }
            }

        }

        return search;
    }

    public static LinkedHashMap decendingOrder(LinkedHashMap<String, Integer> map) {

        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        }
        );
        map.clear();
        for (Map.Entry<String, Integer> item : list) {
            map.put(item.getKey(), item.getValue());
        }

        return map;
    }

    public static LinkedHashMap ascendingOrder(LinkedHashMap<String, Integer> map) {

        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        }
        );
        map.clear();
        for (Map.Entry<String, Integer> item : list) {
            map.put(item.getKey(), item.getValue());
        }

        return map;
    }
    
    public static void show(LinkedHashMap<String,Integer> map)
    {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            
            System.out.println(key+" : "+value);
        }
    }
public static LinkedHashMap topFive(LinkedHashMap<String,Integer> map,int num)
{
    LinkedHashMap<String, Integer> top = new LinkedHashMap<String, Integer>();
    map=decendingOrder(map);
    int value=0;
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
        
        if(value<num){
            
            top.put(entry.getKey(),entry.getValue());
        value++;
        }
    }
    
return top;
}

public static LinkedHashMap bottumFive(LinkedHashMap<String,Integer> map,int num)
{
    LinkedHashMap<String, Integer> bottum = new LinkedHashMap<String, Integer>();
    map=ascendingOrder(map);
    int value=0;
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
        
        if(value<num){
            
            bottum.put(entry.getKey(),entry.getValue());
        value++;
        }
    }
    
return bottum;
}

}
