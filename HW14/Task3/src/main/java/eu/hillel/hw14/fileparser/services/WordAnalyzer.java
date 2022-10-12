package eu.hillel.hw14.fileparser.services;

import java.util.List;
import java.util.Map;

public interface WordAnalyzer {
    Map<String, Integer> wordRepetitionFrequency(List<String> list);
}
