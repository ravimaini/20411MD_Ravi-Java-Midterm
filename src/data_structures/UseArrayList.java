package data_structures;

import databases.SharedStepsDatabase;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseArrayList {

    public static void main(String[] args) throws SQLException {
        /*
         * Demonstrate how to use ArrayList that includes using the add, peek, remove & retrieve methods.
         * Use For-Each loop and While-loop with Iterator to retrieve data_structures.data.
         *
         * Store and retrieve data_structures.data from/to a database table.
         */
        SharedStepsDatabase input = new SharedStepsDatabase();
        List<Object> list = new ArrayList();
        list.add("Toyota");
        list.add("Honda");
        list.add("Nissan");
        list.add("BMW");
        list.add("Audi");
        list.add("Tesla");
        System.out.println("Initial ArrayList: " + list);
        System.out.println(list);


        String tableName = "Cars";
        String coloumnName = "car_make";

        input.insertArrayList(tableName, Collections.singletonList(list));

        String query = "SELECT * FROM Cars";
        list = Collections.singletonList(input.executeQueryReadAll(query));


        System.out.println(list);
    }


    }
