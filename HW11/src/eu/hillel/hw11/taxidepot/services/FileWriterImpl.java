package eu.hillel.hw11.taxidepot.services;

import eu.hillel.hw11.taxidepot.exception.OpenFileException;
import eu.hillel.hw11.taxidepot.exception.WriteFileException;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriterImpl implements FileWriter {

    @Override
    public void write(String content, String path) throws WriteFileException {

        try (FileOutputStream fos = new FileOutputStream(path)) {

            byte[] buffer = content.getBytes();

            fos.write(buffer, 0, buffer.length);

        } catch (IOException ex) {
            throw new WriteFileException("Write error file ");

        }
    }
}
