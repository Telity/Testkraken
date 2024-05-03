import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class no {
    File file = new File("Test.txt");
    FileWriter write;
    Scanner scan = new Scanner(file);
    {
        try {
            write = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    Random rand = new Random();
    ArrayList<Hello> list = new ArrayList<Hello>();

    public no() throws FileNotFoundException {
    }

    public void add() {
        for (int x = 0; x <= 200; x++) {
            int random =rand.nextInt(60);
            list.add(x, new Hello(random, "John", false, true));
        }
    }
    public void fileWrit() {
        for (Hello hello : list) {
            int random = rand.nextInt(70);
            try {
                write.write(String.valueOf(hello));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        try {
            write.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}