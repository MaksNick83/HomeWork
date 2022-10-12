package eu.hillel.hw14.fileparser.services;





import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class FileReaderImpl implements FileReader {


    @Override
    public List<String> read(String path) throws  IOException {
        return Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);

    }
}

