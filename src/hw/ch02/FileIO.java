package hw.ch02;

import java.io.IOException;

public interface FileIO {
    public abstract void readFromFile(String filename) throws IOException;
    public abstract void writeToFile(String filename) throws IOException;
    public abstract void setValue(String key, String value);
    public abstract String getValue(String key);
}
