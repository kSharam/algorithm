import java.io.File;
import java.io.FileNotFoundException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by sharmi on 2/3/15.
 */
public class FileReader {

    public ArrayList<Integer> readFromFile(String path) throws FileNotFoundException {
        ArrayList<Integer> intData = new ArrayList<Integer>();

        Scanner scanner = new Scanner(new File(path));
        scanner.nextLine(); //Skip first line

        while (scanner.hasNext()) {
            String string = scanner.nextLine();
            intData.add(Integer.parseInt(string));
        }
        return intData;
    }
}

