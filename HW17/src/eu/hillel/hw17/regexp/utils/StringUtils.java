package eu.hillel.hw17.regexp.utils;

import java.util.HashMap;

public interface StringUtils {

    int getCountNumberPunctuationMarks(String str);

    String getWordsFirstLastLettersSame(String str);

    String replaceSymbolInWords(String text, int k, char symbolReplace);

    HashMap<String, Integer> countWord(String text);
}
