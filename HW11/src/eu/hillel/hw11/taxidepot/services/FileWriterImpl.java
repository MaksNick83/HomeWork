package eu.hillel.hw11.taxidepot.services;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriterImpl implements FileWriter {

    @Override
    public void write(String content, String path) {

        try (FileOutputStream fos = new FileOutputStream(path)) {

            byte[] buffer = content.getBytes();

            fos.write(buffer, 0, buffer.length);
            System.out.println("The file has been written");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
