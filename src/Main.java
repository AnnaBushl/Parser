import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        File file = new File ("Text.txt");
        Parser parser = new Parser ();
        ArrayList<String> lines = parser.parse(file);
        String input = "�����";
        int sum = 0;
        for (String line:lines) {
            if (input.equals(input)) {
                sum++;
            }
        }
        if(sum!=0)
        {
            System.out.println("� ������ ������ ���� ��������� � ��� �����������: "+ sum );
        }
        else
        {
            System.out.println("� ������ ������ ��� ���� �������� � ������������");
        }




        int m = 0;
        System.out.println("������� ���������");

        for (int i = 1; i<=10;i++){
            for (int k = 1; k<=10;k++){
                m = i * k;
                System.out.print(" " + m);
            }
            System.out.println();
        }
    }
}
