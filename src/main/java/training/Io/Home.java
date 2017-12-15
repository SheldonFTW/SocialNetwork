package training.Io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

import static java.awt.SystemColor.text;

public class Home {

    public static void main(String[] args) throws IOException {
        //existe();
        //fileReader();
        //fileWriter();
        //bufferReader();
        //bufferWriter();
        //masWrite();
        //WriteToString();
        readAndWrite();




    }

    private static void readAndWrite() throws IOException {
        final String fileFrom = "src\\main\\resources\\Files\\From";
        final String fileTo = "src\\main\\resources\\Files\\To";

        FileReader from = new FileReader(fileFrom);
        FileWriter toThe = new FileWriter(fileTo,true);

        final BufferedReader bufferedReader = new BufferedReader(from);

        String data;

        while ((data = bufferedReader.readLine()) != null) {

            System.out.println(data);
            Files.write(Paths.get(String.valueOf(toThe)),data.getBytes());

        }


    }

    private static void WriteToString() throws IOException {

        final String filePath = "src\\main\\resources\\Files\\From";
        String text = "Some text";
        Files.write(Paths.get(filePath),text.getBytes());


    }

    private static void masWrite() throws IOException {
        final String filePath = "src\\main\\resources\\Files\\From";

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));

        String mas[] = new String[5];
        for (int i = 0; i < mas.length; i++) {
            mas[i]="Hello";
            bufferedWriter.write(i);
            bufferedWriter.flush();
            System.out.println(Arrays.toString(mas));
        }
        bufferedWriter.close();
    }

    private static void bufferWriter() throws IOException {
        final String filePath = "src\\main\\resources\\Files\\From";

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Some Words");

        String word = scanner.next();

        bufferedWriter.write(word);
        bufferedWriter.flush();
        bufferedWriter.close();

    }

    private static void bufferReader() throws IOException {

        final String filePath = "src\\main\\resources\\Files\\From";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

        String data;
        int count = 0;

        while ((data = bufferedReader.readLine()) != null) ;{
            count ++;
            System.out.println(count);
        }
        bufferedReader.close();



    }

    private static void fileWriter() throws IOException {

        final String fileWriter= "src\\main\\resources\\Files\\From";

        FileWriter write = new FileWriter(fileWriter);
        write.write("Hello World!");
        write.flush();
        write.close();

    }

    private static void fileReader() throws IOException {

        final String file = "src\\main\\resources\\Files\\File";
        FileReader reader = new FileReader(file);

        int data;

        while ((data = reader.read()) != -1) {

            System.out.print((char) data);

        }
    }

    private static void existe() {

        final String filePah = "src\\main\\resources\\Files\\file.txt";
        File file = new File(filePah);

        if (file.exists()) {
            System.out.println("File exist");
        } else{
            System.out.println("False");
        }
    }
}
