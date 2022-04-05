package data_structures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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

            System.out.println(result);
        } finally {
            br.close();
        }

    }
}