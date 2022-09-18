package file7;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;


public class ThirdTask {
    public static List<Integer> getFromPoz(String path, int poz) {
        try (var raf = new RandomAccessFile(path, "r")) {
            var res = new ArrayList<Integer>();
            raf.seek(4 + poz * 4L);
            while (raf.getFilePointer() < raf.length()) {
                res.add(raf.readInt());
            }
            return res;
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при чтении файла");
        }
    }
}
