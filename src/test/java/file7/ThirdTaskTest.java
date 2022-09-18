package file7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class ThirdTaskTest {

    @Test
    void getFromPoz() {
        var filename = "integers.bin";
        var data = new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(3);
        }};

        FirstTask.writeIntListToBinFile(data, filename);
        Assertions.assertEquals(data, ThirdTask.getFromPoz("integers.bin", 0));

        data.remove(0);
        Assertions.assertEquals(data, ThirdTask.getFromPoz("integers.bin", 1));

        data.remove(0);
        Assertions.assertEquals(data, ThirdTask.getFromPoz("integers.bin", 2));
    }
}