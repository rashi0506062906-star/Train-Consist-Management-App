import java.util.LinkedHashSet;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Create LinkedHashSet for train formation
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        System.out.println("===== TRAIN CONSIST MANAGEMENT (UC5) =====");

        // 🔹 Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // 🔹 Attempt to add duplicate
        trainFormation.add("Sleeper"); // duplicate (ignored)

        // 🔹 Display formation
        System.out.println("\nFinal Train Formation (Insertion Order Preserved):");
        System.out.println(trainFormation);

        System.out.println("===========================================");
    }
}