package eu.hillel.hw14.fileparser.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordAnalyzerImpl implements WordAnalyzer {


    public Map<String, Integer> wordRepetitionFrequency(List<String> list) {

        Map<String, Integer> map = new HashMap<>();
        list.forEach(line -> {
            String words[] = line.split("\\W+");
            for (String word : words) {
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                    continue;
                }
                map.put(word, 1);
            }
        });

        return map;
    }

}
