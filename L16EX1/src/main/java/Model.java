import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Model implements Serializable {
    private List<String> messages = new ArrayList<>();
    private static final Logger LOGGER = LoggerFactory.getLogger(Model.class);

    public static Model read() {
        try {
            FileInputStream fis = new FileInputStream("data.txt");
            ObjectInputStream oin = new ObjectInputStream(fis);
            return (Model) oin.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new Model();
        }
    }

    public String addMessage(String message) {
        messages.add(message);
        serialize();
        return "Success";
    }

    private void serialize() {
        try {
            FileOutputStream fos = new FileOutputStream("data.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
    }

    public List<String> getMessage() {
        return messages;
    }
}