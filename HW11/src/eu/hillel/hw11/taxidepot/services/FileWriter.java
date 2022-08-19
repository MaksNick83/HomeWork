package eu.hillel.hw11.taxidepot.services;

import eu.hillel.hw11.taxidepot.exception.WriteFileException;

public interface FileWriter {

    void write(String content, String path) throws WriteFileException;

}
