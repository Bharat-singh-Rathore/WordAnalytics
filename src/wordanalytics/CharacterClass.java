package wordanalytics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import static wordanalytics.WordClass.stopWord;

public class CharacterClass {

    static File file = new File("C:\\Users\\Asus\\Desktop\\codechef\\wrdcunt.txt");
    static String word = "";
    static ArrayList<String> list = new ArrayList<String>();
    static LinkedHashMap<String, Integer> charactermap = new LinkedHashMap<String, Integer>();
    static LinkedHashMap<String, Integer> search = new LinkedHashMap<String, Integer>();

    public static void filtretion() throws FileNotFoundException {

        Scanner sc = new Scanner(file);

        while (sc.hasNext()) {

            word = word + sc.next();

        }

        word = word.toLowerCase();
        word = word.replaceAll("[^a-zA-Z0-9]", "");
        word = word.replaceAll(" ", "");

    }

    public static LinkedHashMap charcount() {

        for (int i = 0; i < word.length(); i++) {

            Character c = word.charAt(i);

            String s = Character.toString(c);

            list.add(s);
        }
        for (String string : list) {

            charactermap.put(string, Collections.frequency(list, string));
        }

        return charactermap;
    }

    public static LinkedHashMap wihtOutStop() throws FileNotFoundException
    {
    Scanner sc=new Scanner(file); 
    ArrayList<String> stopword=new ArrayList<String>();
    ArrayList<String> listChar=new ArrayList<String>();
    LinkedHashMap<String,Integer> Charmap=new LinkedHashMap<String,Integer>();
    String charWord="";
    
    File stop = new File("C:\\Users\\Asus\\Desktop\\codechef\\StopWords.txt");

        Scanner st = new Scanner(stop);

        while (st.hasNext()) {
            stopWord.add(st.next());
        }
    
    while(sc.hasNext())
    {
    String word=sc.next();
    word=word.toLowerCase();
    word=word.replaceAll("[^a-zA-Z0-9]","");
    listChar.add(word);
    }
      
    listChar.removeAll(stopWord);
    
    
   
        for (String string : listChar) {
            charWord=charWord+string;
        }
        listChar.clear();
        charWord = charWord.replaceAll(" ", "");
     
      for (int i = 0; i < charWord.length(); i++) {

            Character c = charWord.charAt(i);

            String s = Character.toString(c);

            listChar.add(s);
        }
      
        for (String string : listChar) {

            Charmap.put(string, Collections.frequency(listChar, string));
        }

        return Charmap;  
        
        
    }
    
}
