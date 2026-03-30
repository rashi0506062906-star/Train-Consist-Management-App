import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Create LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        System.out.println("===== TRAIN CONSIST MANAGEMENT (UC4) =====");

        // 🔹 Add bogies (order matters)
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(trainConsist);

        // 🔹 Insert Pantry Car at position 2
        trainConsist.add(2, "Pantry");

        System.out.println("\nAfter Adding Pantry Car at position 2:");
        System.out.println(trainConsist);

        // 🔹 Remove first and last bogie
        trainConsist.removeFirst();  // Engine removed
        trainConsist.removeLast();   // Guard removed

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(trainConsist);

        // 🔹 Final ordered consist
        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);

        System.out.println("==========================================");
    }
}