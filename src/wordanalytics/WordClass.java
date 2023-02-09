package wordanalytics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordClass {

    static File file = new File("C:\\Users\\Asus\\Desktop\\codechef\\wrdcunt.txt");

    static ArrayList<String> list = new ArrayList<String>();
    static ArrayList<String> stopWord = new ArrayList<String>();
    static LinkedHashMap<String, Integer> withStop = new LinkedHashMap<String, Integer>();
    static LinkedHashMap<String, Integer> withOutStop = new LinkedHashMap<String, Integer>();
 

    public static void filtretion() throws FileNotFoundException {

        Scanner sc = new Scanner(file);

        while (sc.hasNext()) {
            String word = sc.next();
            word = word.toLowerCase();
            word = word.replaceAll("[^a-zA-Z0-9]", "");
            list.add(word);
        }

    }

    public static LinkedHashMap withStopWord() {

        for (String string : list) {

            withStop.put(string, Collections.frequency(list, string));
        }

        return withStop;
    }

    public static LinkedHashMap withoutStopWord() throws FileNotFoundException {

        File stop = new File("C:\\Users\\Asus\\Desktop\\codechef\\StopWords.txt");

        Scanner st = new Scanner(stop);

        while (st.hasNext()) {
            stopWord.add(st.next());
        }

        list.removeAll(stopWord);

        for (String string : list) {

            withOutStop.put(string, Collections.frequency(list, string));
        }

        for (Map.Entry<String, Integer> m : withOutStop.entrySet()) {

            String key = m.getKey();
            Integer value = m.getValue();

            System.out.println(key + " : " + value);
        }

        return withOutStop;
    }

}
