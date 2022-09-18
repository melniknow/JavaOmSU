package file7;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ThirdTask {
    public static List<Integer> getFromPoz(String path, int poz) throws IOException {
        var raf = new RandomAccessFile(path, "r");
        var text = raf.readLine();
        raf.close();

        return new ArrayList<>(Arrays.stream(text.substring(poz).split(" ")).filter(n -> !n.equals("")).map(Integer::valueOf).toList());
    }
}
