package file7;

import java.io.*;

public class HouseService {
    public static void serializeHouse(House house, String filename) {
        try (ObjectOutput out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filename)))) {
            out.writeObject(house);
        } catch (IOException e) {
            throw new RuntimeException("Ошибка сериализации");
        }
    }

    public static House deserializeHouse(String filename) {
        try (ObjectInput in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filename)))) {
            return (House) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Ошибка десериализации");
        }
    }
}
