package data_structures;

import databases.SharedStepsDatabase;

import java.io.*;
import java.sql.SQLException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DataReader {

    /**
     * Create an API to read the .txt file and print it to the console.
     * HINT: Use BufferedReader class
     * Use try-catch block to handle any exceptions
     * <p>
     * Store and retrieve the file to/from a database table.
     * <p>
     * After reading from file using BufferedReader API, store each word, first into a LinkedList. Each word
     * should construct a node in LinkedList. Second, do the same, but with a Stack.
     * Finally, traverse through the list\stack & retrieve each item in `FIFO` order and `FILO` order, respectively
     * <p>
     * Demonstrate how to use a stack using push, peek, search & pop methods.
     * Use For-Each & While-loop with Iterator to retrieve/print data.
     **/

    public static void main(String[] args) throws IOException {
        String textFilePath = System.getProperty("user.dir") + "/src/data_structures/data/self-driving-car";
        SharedStepsDatabase object = new SharedStepsDatabase();
        String fileContents = "";
        LinkedList<String> wordList = new LinkedList<>();

        String result;
        BufferedReader br = new BufferedReader(new FileReader(textFilePath));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                sb.append("\r");
                line = br.readLine();
            }
            result = sb.toString();

            //    System.out.println(result);
        } finally {
            br.close();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(textFilePath));
            String line;

            while ((line = reader.readLine()) != null)
                System.out.println(line);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(textFilePath);

        String tableName = "dataReader";
        String coloumnName = "dataRader";
        List<String> fileUpload = Collections.singletonList(System.getProperty("user.dir") +
                "\\src\\data_structures\\data\\self-driving-car\\");
        object.insertList(tableName, coloumnName, Collections.singletonList(fileUpload));
        String query = "SELECT * FROM dataReader";
        String dataReader = null;
        try {
            dataReader = String.valueOf(object.executeQueryReadAll(query));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(dataReader);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(textFilePath));
            String line;
            while ((line = reader.readLine()) != null)
                fileContents += line;
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        wordList.add((fileContents));
        System.out.println(wordList);


        File file = new File(textFilePath);
        Scanner scan = null;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        wordList = new LinkedList<>();
        while (scan.hasNextLine()) {
            fileContents = fileContents.concat(scan.nextLine() + "\n");
        }
        wordList.add(fileContents);
        System.out.print(wordList);
    }

}