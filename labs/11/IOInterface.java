import java.io.IOException;
public interface IOInterface {
public void saveToFile(String filename, String donor) throws IOException;
public void loadFromFile(String filename,Check[]arrCheck)throws IOException;
}