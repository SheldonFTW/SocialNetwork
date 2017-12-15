package training.Io;

import javafx.scene.shape.Path;
import sun.swing.FilePane;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;


public class Read {


    public static void main(String[] args) throws IOException {


        //readAndWrite();
        //quation();
        //joiner();


        /*final String filePath = "src\\main\\resources\\Files\\file.txt";
        File file = new File(filePath);

        if (file.exists()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
*/
        /*if (file.delete()) {
            System.out.println("File delete");
        } else {
            file.createNewFile();
            System.out.println("File created");
        }*/

       /* FileReader reader = new FileReader(file);

        int data;

        while ((data = reader.read())!=-1){
            System.out.print((char) data);
        }

        FileWriter write = new FileWriter(filePath,true);
        write.write("Welcome");
        write.flush();
        write.close();*/

        /*BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

        String data;

        int count = 0;

        while ((data = bufferedReader.readLine()) != null) {
            count++;
            System.out.println(data);
        }

        System.out.println(count);

        bufferedReader.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,true));
        writer.write("Hello");
        writer.flush();
        writer.close();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text");
        String line = scanner.nextLine();
        System.out.println("Your text: ");
        System.out.println(line);
        System.out.println("Enter number");
        Integer number = scanner.nextInt();
        System.out.println(number + 10);
        scanner.close();*/
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int a = scanner.nextInt();

        FileWriter writer = new FileWriter(filePath,true);
        int[] mas = new int[5];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = a++;
            writer.write(a);
            writer.write("\n");
            writer.flush();

        }

        System.out.println(Arrays.toString(mas));


        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter text");
        String b = scanner.next();

        FileWriter writer1 = new FileWriter(filePath,true);
        String[] mas2 = new String[5];
        for (int c = 0; c < mas2.length; c++) {
            mas2[c] = b;
            writer.write(b);
            writer.write("\n");
            writer.flush();
        }
        writer.close();
        scanner.close();
        System.out.println(Arrays.toString(mas2));*/

    }



    private static void WriteToString() throws IOException {
        final String filePath = "src\\main\\resources\\Files\\file.txt";
        String text = "Some text";
        Files.write(Paths.get(filePath),text.getBytes());




    }

    private static void readAndWrite() throws IOException {
        final String fileFrom = "src\\main\\resources\\Files\\From";
        final String fileTo = "src\\main\\resources\\Files\\To";

        FileReader fileReader = new FileReader(fileFrom);
        FileWriter fileWriter = new FileWriter(fileTo);

        final BufferedReader read = new BufferedReader(new FileReader(fileFrom));

        String data;

        while ((data = read.readLine())!=null) {
            String replase = data.replace("(",")");
            System.out.println(replase);

            Files.write(Paths.get(fileTo),replase.getBytes());
        }

    }
    public static void quation() throws IOException {
        final String fileName = "src\\main\\resources\\Files\\From";
        final String fileSurname = "src\\main\\resources\\Files\\To";

        FileWriter fileWriter = new FileWriter(fileName,true);
        FileWriter fileWriter1 = new FileWriter(fileSurname,true);

        final  BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        final BufferedWriter bufferedWriter1 = new BufferedWriter(fileWriter1);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.next();
        System.out.println("Enter your surname");
        String surnane = scanner.next();

        bufferedWriter.write(name);
        bufferedWriter.write("\n");
        bufferedWriter1.write(surnane);

        System.out.println(name);
        System.out.println(surnane);

        bufferedWriter.flush();
        bufferedWriter.close();
        scanner.close();



    }

    public static void joiner() {

        final StringJoiner joiner = new StringJoiner(" and ");

        joiner.add("Kiev");
        joiner.add("Lviv");
        joiner.add("Kharkiv");

        System.out.println(joiner.toString());

    }






}
