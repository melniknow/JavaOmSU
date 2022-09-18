package file7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FourthTask {
    public static List<Path> getFilesFromDirWithType(String type, String path) {
        try (var stream = Files.walk(Paths.get(path), 1)) {
            return stream
                    .filter(n -> Files.isRegularFile(n) && n.toFile().getName().endsWith("." + type))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при поиске файлов");
        }
    }
}
