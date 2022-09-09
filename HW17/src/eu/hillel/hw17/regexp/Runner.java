package eu.hillel.hw17.regexp;

import eu.hillel.hw17.regexp.utils.StringUtils;
import eu.hillel.hw17.regexp.utils.StringUtilsImpl;

import java.util.HashMap;


public class Runner {
    public static void main(String[] args) {
      /*  1. Определить, сколько раз повторяется в тексте каждое слово, которое встречается в нем.
        2. В каждом слове текста k-ю букву заменить заданным символом. Если k больше длины слова, корректировку не выполнять.
        3. Напечатать без повторения слова текста, у которых первая и последняя буквы совпадают
        4. Подсчитать количество содержащихся в данном тексте знаков препинания*/
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
