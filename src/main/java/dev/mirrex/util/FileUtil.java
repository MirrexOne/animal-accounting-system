package dev.mirrex.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileUtil {
    public static List<String> readFile(String filename) throws IOException {
        Path path = Paths.get(filename);
        return Files.readAllLines(path);
    }
}
