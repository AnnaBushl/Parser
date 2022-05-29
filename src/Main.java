import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        File file = new File("Text.txt");
        Parser parser = new Parser();
        parser.parse(file);
        ArrayList<String> lines = parser.parse(file);
        ArrayList<String> words = new ArrayList<>();
        String input = "(.*)[Сс]трад(.*)[^?!,.]";
        Pattern pattern = Pattern.compile(input);
        int sum = 0;
        for (String line: lines) {
            if (pattern.matcher(line).find()){
                System.out.println(line);
                sum++;
            }
        }
        if (sum != 0){
            System.out.println("Количество слов Старадание и однокоренных в тексте " + sum);
        }
        else {
            System.out.println("Таких слов нет");
        }



        int m = 0;
        System.out.println("Таблица умножения");

        for (int i = 1; i<=10;i++){
            for (int k = 1; k<=10;k++){
                m = i * k;
                System.out.print(" " + m);
            }
            System.out.println();
        }
    }
}
