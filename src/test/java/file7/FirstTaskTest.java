package file7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FirstTaskTest {

    @Test
    void writeAndReadIntListToBinFile() {
        var filename = "integers.bin";
        var data = new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(3);
        }};

        FirstTask.writeIntListToBinFile(data, filename);

        Assertions.assertEquals(data, FirstTask.readIntegersFromBinFile(filename));
    }
}