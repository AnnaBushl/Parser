import org.w3c.dom.Text;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Parser {

    ArrayList<String> parse(File file){
        ArrayList<String> lines = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();

        // Для BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line  = " ";
            while ((line = br.readLine()) != null) {
                lines.add(line);

            }
        }

/*         //Для Scanner
          try (Scanner scanner = new Scanner(file).useDelimiter("\\s+") ) {
              String line  = " ";
              while (scanner.hasNextLine()) {
                  lines.add(line);
                  line = scanner.nextLine();
              }
          }*/
         catch (IOException e) {
            e.printStackTrace();

        }
        for (String line:lines) {
            words.addAll(Arrays.asList(line.split("\\s+")));


        }
        return words;
    }
}
