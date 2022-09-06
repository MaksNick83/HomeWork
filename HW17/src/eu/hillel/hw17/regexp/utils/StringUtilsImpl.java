package eu.hillel.hw17.regexp.utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilsImpl implements StringUtils {
    public HashMap<String, Integer> countWord(String text) {

        String[] words = getWords("[ !.,;:?\n]", text);

        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (word.length() <= 1) {
                continue;
            }
            wordCount.put(word, (int) Arrays
                    .stream(words)
                    .filter(word::equals)
                    .count());
        }
        return wordCount;
    }

    private String[] getWords(String regex, String text) {
        Pattern pattern = Pattern.compile(regex);
        String[] words = pattern.split(text);
        return words;
    }

    public String replaceSymbolInWords(String text, int k, char symbolReplace) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = getWords(" ", text);
        for (String word : words) {
            if (word.length() >= k) {
                stringBuilder.append(word.substring(0, k - 1)).append(symbolReplace).append(word.substring(k, word.length()));
            } else {
                stringBuilder.append(word);
            }
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    public String getWordsFirstLastLettersSame(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        text.strip();
        String[] words = getWords("[ !.,;:?]", text);
        for (String word : words) {
            if ((word.length() > 1) && word.charAt(0) == word.charAt(word.length() - 1) && (stringBuilder.indexOf(word) == -1)) {
                stringBuilder.append(word).append("\n");
            }
        }
        return stringBuilder.toString();
    }

    public int getCountNumberPunctuationMarks(String text) {
        Pattern pattern = Pattern.compile("[!.,;:?-]");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
