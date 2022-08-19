package eu.hillel.hw11.taxidepot.services;

import eu.hillel.hw11.taxidepot.exception.OpenFileException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReaderImpl implements FileReader {
    @Override
    public String read(String path) throws OpenFileException {

        String fileInString = "";

        try (FileInputStream fin = new FileInputStream(path)) {
            int i = -1;
            while ((i = fin.read()) != -1) {
                fileInString += (char) i;
            }
        } catch (Exception e) {
            throw new OpenFileException("Open error file ");
        }
        return fileInString;
    }


}
