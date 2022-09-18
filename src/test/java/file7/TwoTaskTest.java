package file7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TwoTaskTest {

    @Test
    void writeAndReadCharsInFileWithSpaces() {
        var filename = "input.txt";
        var data = new ArrayList<Character>() {{
            add('a');
            add('b');
            add('c');
            add('d');
        }};

        TwoTask.writeCharsInFileWithSpaces(data, filename);

        Assertions.assertEquals(data, TwoTask.readCharsFromFile(filename));
    }
}