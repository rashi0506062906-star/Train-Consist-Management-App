import java.util.ArrayList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Create ArrayList for passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        System.out.println("===== TRAIN CONSIST MANAGEMENT =====");

        // 🔹 Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // 🔹 Display after insertion
        System.out.println("\nAfter Adding Passenger Bogies:");
        System.out.println(passengerBogies);

        // 🔹 Remove one bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println(passengerBogies);

        // 🔹 Check existence
        String checkBogie = "Sleeper";
        if (passengerBogies.contains(checkBogie)) {
            System.out.println("\nBogie '" + checkBogie + "' exists in the train.");
        } else {
            System.out.println("\nBogie '" + checkBogie + "' does NOT exist.");
        }

        // 🔹 Final state
        System.out.println("\nFinal Passenger Bogie List:");
        System.out.println(passengerBogies);

        System.out.println("====================================");
    }
}