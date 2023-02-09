package wordanalytics;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedHashMap;

public class SentenceClass {

    static File file = new File("C:\\Users\\Asus\\Desktop\\codechef\\wrdcunt.txt");
    static ArrayList<String> list = new ArrayList<String>();
    static LinkedHashMap<String, Integer> sentenceWithStop = new LinkedHashMap<String, Integer>();

    public static void filtretion() throws FileNotFoundException {
        Scanner sc = new Scanner(file);

        String paragraph = "";

        while (sc.hasNext()) {
            paragraph = paragraph + " " + sc.next();

        }

        String paragraphArray[] = paragraph.split("\\.");

        for (String string : paragraphArray) {

            string = string.toLowerCase();

            list.add(string);

        }

    }

    public static LinkedHashMap withStopWord() {

        for (String string : list) {

            sentenceWithStop.put(string, Collections.frequency(list, string));
        }

        return sentenceWithStop;
    }

}
