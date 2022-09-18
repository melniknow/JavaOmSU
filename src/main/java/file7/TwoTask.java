package file7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TwoTask {
    public static void writeCharsInFileWithSpaces(List<Character> characterList, String filename) {
        try (var writer = new FileWriter(filename)) {
            for (Character c : characterList) writer.write(c);
        } catch (IOException e) {
            throw new RuntimeException("Ошибка записи в файл");
        }
    }

    public static List<Character> readCharsFromFile(String filename) {
        try (var reader = new FileReader(filename)) {
            var listChar = new ArrayList<Character>();
            while (reader.ready()) listChar.add((char) reader.read());

            return listChar;
        } catch (IOException e) {
            throw new RuntimeException("Ошибка чтения из файла");
        }
    }
}
