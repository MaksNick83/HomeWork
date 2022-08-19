package eu.hillel.hw11.taxidepot.services;

import eu.hillel.hw11.taxidepot.exception.OpenFileException;

public interface FileReader {

    String read(String path) throws OpenFileException;

}
