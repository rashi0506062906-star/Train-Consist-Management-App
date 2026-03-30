import java.util.HashSet;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Create HashSet for unique bogie IDs
        HashSet<String> bogieIds = new HashSet<>();

        System.out.println("===== TRAIN CONSIST MANAGEMENT (UC3) =====");

        // 🔹 Add bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // 🔹 Display final set
        System.out.println("\nBogie IDs after insertion (duplicates ignored):");
        System.out.println(bogieIds);

        // 🔹 Show size to prove uniqueness
        System.out.println("\nTotal Unique Bogies: " + bogieIds.size());

        System.out.println("==========================================");
    }
}