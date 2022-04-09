package data_structures;
import databases.SharedStepsDatabase;
import java.sql.SQLException;
import java.util.*;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add, peek, remove & poll elements.
         * Use For-Each loop and While-Loop with Iterator to retrieve data_structures.data.
         *
         * Store and retrieve data_structures.data from/to a database table.
         */

        Queue<String> names = new LinkedList<>();

        names.add("Ravi");
        names.add("Malik");
        names.add("Adam");
        names.add("Brehon");
        names.add("Alma");

        System.out.println("Initial Queue: " + names);

        names.peek();
        System.out.println("Peeking at: " + names.peek());

        names.remove("Adam");
        System.out.println("After removal: " + names);

        names.poll();
        System.out.println("Final Queue after Poll: " + names);

        Queue<String> vehicleBrand = new LinkedList<>();

        vehicleBrand.add("Toyota");
        vehicleBrand.add("Honda");
        vehicleBrand.add("Nissan");

        Iterator iterator = vehicleBrand.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        for (String s : vehicleBrand) {
            System.out.print(s + " ");
        }

        String tableName = "Employee_Names";
        String coloumnName = "Names";
        SharedStepsDatabase sql = new SharedStepsDatabase();

        // IMPLEMENT HERE

        sql.insertList(tableName, coloumnName, Collections.singletonList(names));

        String query = "SELECT * FROM names";

        try {
            coloumnName = String.valueOf(sql.executeQueryReadAll(query));
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
        System.out.println(coloumnName);
    }
}