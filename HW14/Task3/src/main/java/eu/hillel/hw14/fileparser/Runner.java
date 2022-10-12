package eu.hillel.hw14.fileparser;


import eu.hillel.hw14.fileparser.services.FileReader;
import eu.hillel.hw14.fileparser.services.FileReaderImpl;
import eu.hillel.hw14.fileparser.services.WordAnalyzer;
import eu.hillel.hw14.fileparser.services.WordAnalyzerImpl;

import java.io.IOException;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        String fileIn = "HW14/Task3/src/main/resources/example.txt";
        FileReader fileReader = new FileReaderImpl();

        List<String> contentFile;
        try {
            contentFile = fileReader.read(fileIn);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }

        WordAnalyzer wordAnalyzer = new WordAnalyzerImpl();
        System.out.println(wordAnalyzer.wordRepetitionFrequency(contentFile));


    }

}
