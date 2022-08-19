package eu.hillel.hw11.taxidepot.services;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReaderImpl implements FileReader {
    @Override
    public String read(String path) {

        String fileInString = "";

        try (FileInputStream fin = new FileInputStream(path)) {
            int i = -1;
            while ((i = fin.read()) != -1) {
                fileInString += (char) i;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File NotFound");
        } catch (IOException e) {
            System.out.println("An I/O Error");
        }
        return fileInString;
    }


}
