package training;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.StringJoiner;

public class StringJoyner {
    public static void main(String[] args) throws IOException {

        //joiner();
        ////oddString();


        //private static void oddString() throws IOException {
    /*    final String rider = "src\\main\\resources\\Files\\Sourse";
        final String wrirerOdd = "src\\main\\resources\\Files\\Odd";
        final String writerEven = "src\\main\\resources\\Files\\Even";

        String text = null;
        int data;

        final FileReader sourse = new FileReader(rider);
        final FileWriter odd = new FileWriter(wrirerOdd, true);
        final FileWriter even = new FileWriter(writerEven, true);

        while ((data = sourse.read()) !=-1) {
            data++;
            if (data % 2 == 0) {
                sourse.read(rider);
                odd.write(text);
                odd.flush();
            } else {
                sourse.read(rider);
                even.write(text);

            }
        }
    }

    public static void joiner() throws IOException {

        String text;

        final String write = "src\\main\\resources\\Files\\To";

        final FileWriter fileWriter = new FileWriter(write, true);
        final StringJoiner joiner = new StringJoiner(" and ");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Stop to finish");
            System.out.println("Enter text");
            text = scanner.nextLine();

            if (text.equals("Stop")) {
                break;
            }

            StringJoiner joinText = joiner.add(text);
            Files.write(Paths.get(write),text.getBytes());
            System.out.println(joiner);

        }

    }
*/
    }
}


