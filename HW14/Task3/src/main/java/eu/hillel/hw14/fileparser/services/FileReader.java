package eu.hillel.hw14.fileparser.services;
import java.io.IOException;
import java.util.List;

public interface FileReader {

    List<String> read(String path) throws  IOException;

}
