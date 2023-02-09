package wordanalytics;

import java.io.FileNotFoundException;
import java.util.LinkedHashMap;

public class WordAnalytics {

    public static void main(String[] args) throws FileNotFoundException {

        LinkedHashMap<String,Integer> word=new LinkedHashMap<String,Integer>();
        LinkedHashMap<String,Integer> searchword=new LinkedHashMap<String,Integer>();
        LinkedHashMap<String,Integer> topwords=new LinkedHashMap<String,Integer>();
         System.out.println("----------------word count With Stop Words-------------------");
        WordClass.filtretion();
        word=WordClass.withStopWord();
        Operations.show(word);
        System.out.println("----------------word count Without Stop Words-------------------");
        word=WordClass.withoutStopWord();
        Operations.show(word);
         System.out.println("----------------word count user searched Words-------------------");
       searchword=  Operations.search(word);
       Operations.show(searchword);
       System.out.println("----------------word count  top  Words-------------------");
      topwords= Operations.topFive(word, 5);
      Operations.show(topwords);
       System.out.println("----------------word count bottum  Words-------------------");
      topwords= Operations.bottumFive(word, 5);
      Operations.show(topwords);
      
     
     
       System.out.println("======================================================================");
     
     LinkedHashMap<String,Integer> character=new LinkedHashMap<String,Integer>();
        LinkedHashMap<String,Integer> searchcharacter=new LinkedHashMap<String,Integer>();
        LinkedHashMap<String,Integer> topcharacter=new LinkedHashMap<String,Integer>();
       
        System.out.println("----------------character count With Stop character-------------------");
       CharacterClass.filtretion();
      character= CharacterClass.charcount();
       Operations.show(character);
      System.out.println("----------------character count  Without Stop character-------------------");
         character= CharacterClass.wihtOutStop();
         Operations.show(character);
         System.out.println("----------------character count user searched character-------------------");  
       searchcharacter=  Operations.search(character);
       Operations.show(searchcharacter);
         System.out.println("----------------character count top character-------------------");
       topcharacter =Operations.topFive(character, 5);
       Operations.show(topcharacter);
        System.out.println("----------------character count bottum character-------------------");
       topcharacter =Operations.bottumFive(character, 5);
       Operations.show(topcharacter);
      
         System.out.println("======================================================================");
      
         LinkedHashMap<String,Integer> sentence=new LinkedHashMap<String,Integer>();
        LinkedHashMap<String,Integer> searchsentence=new LinkedHashMap<String,Integer>();
        LinkedHashMap<String,Integer> topsentence=new LinkedHashMap<String,Integer>();
       
        System.out.println("----------------sentecne count With Stop sentecne-------------------");
        SentenceClass.filtretion();
       sentence= SentenceClass.withStopWord();
        Operations.show(sentence);
        
        System.out.println("----------------sentecne count search sentecne-------------------");
        searchsentence = Operations.search(sentence);
        Operations.search(searchsentence);
        
        System.out.println("----------------sentecne count top  sentecne-------------------");
        topsentence=Operations.topFive(sentence, 5);
        Operations.show(topsentence);
        
        System.out.println("----------------sentecne count bottum Stop sentecne-------------------");
        topsentence = Operations.bottumFive(sentence, 5);
        Operations.show(topsentence);
    }

}
