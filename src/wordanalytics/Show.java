/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordanalytics;
import java.util.Map;
import java.util.TreeMap;
/**
 *
 * @author Asus
 */
public class Show {
    
    public static void show(TreeMap<String,Integer> map)
    {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            
            System.out.println(key+" : "+value);
        }
    }
    
    public static void showChar(TreeMap<Character,Integer> map)
    {
    
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            
             System.out.println(key+" : "+value);
        }
        
    }
}
