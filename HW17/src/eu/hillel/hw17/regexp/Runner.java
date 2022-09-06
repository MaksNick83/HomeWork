package eu.hillel.hw17.regexp;

import eu.hillel.hw17.regexp.utils.StringUtils;
import eu.hillel.hw17.regexp.utils.StringUtilsImpl;

import java.util.HashMap;


public class Runner {
    public static void main(String[] args) {

        String str = """
                   Regular expressions are a formal, language used in computer programs that work with text to search for
                 and manipulate substrings in text.
                """;
        StringUtils regExp = new StringUtilsImpl();
        System.out.println(regExp.getCountNumberPunctuationMarks(str));
        System.out.println(regExp.getWordsFirstLastLettersSame(str));
        System.out.println(regExp.replaceSymbolInWords(str, 2, '/'));
        HashMap<String, Integer> wordCount = regExp.countWord(str);
        for (String word : wordCount.keySet()) {
            System.out.println(word + " " + wordCount.get(word));
        }
    }
}
