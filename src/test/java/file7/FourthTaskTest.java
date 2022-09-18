package file7;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FourthTaskTest {

    @Test
    void getFilesFromDirWithType() { // Тест привязан к файловой системе
        var pngPathList = FourthTask.getFilesFromDirWithType("png", "/home/sergey");
        var txtPathList = FourthTask.getFilesFromDirWithType("txt", "/home/sergey");

        var txtData = new ArrayList<String>() {{
            add("/home/sergey/1.txt");
        }};

        assertTrue(pngPathList.isEmpty());
        assertEquals(txtData, txtPathList.stream().map(Path::toString).toList());
    }
}