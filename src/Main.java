import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap to store student names and their grades - done
        // Add some student grades - done
        // Display all student grades
        // Update a student's grade with put.
        // NB: only one entry for Alice
        // Remove a student's grade
        // Check if a student is in the HashMap - done
        // Display all student grades after updates

        HashMap<String, Integer> students = new HashMap<>();

        students.put("Jonas", 10);
        students.put("Julius", 12);
        students.put("Falulah", 7);
        students.put("Moses", 4);
        students.put("Vishnu", 2);

        System.out.println(students.values());

        for (Integer g : students.values()) { // for each loop
            System.out.println(g);
        }

        System.out.println(students);

        students.put("Julius", 13);

        System.out.println(students);

        students.put("Julius",null);

        System.out.println(students);

        students.remove("Julius");

        System.out.println(students);

        // check if in HashMap



        System.out.println("students contains Julius: "+ students.containsKey("Julius"));

        students.put("Julius",null);
        students.put("Julia",null);

        System.out.println(students);
        System.out.println("students contains Julius: "+ students.containsValue(null));

        // Display all student grades after updates
        // for each

        // Map.Entry<x,y> ... .entrySet()
        for (String g : students.keySet()) { // keys
        }
        for (Integer g : students.values()) { // values
        }

        for (Map.Entry<String, Integer> entry : students.entrySet()) { // keys and values
            System.out.println(entry.getKey() + " " + entry.getValue());
        }




    }

}






