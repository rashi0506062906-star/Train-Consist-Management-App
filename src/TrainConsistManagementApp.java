import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Bogie class (Custom Object)
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("===== TRAIN CONSIST MANAGEMENT (UC7) =====");

        // 🔹 Create List of Bogies
        List<Bogie> bogies = new ArrayList<>();

        // 🔹 Add passenger bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // 🔹 Display before sorting
        System.out.println("\nBefore Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // 🔹 Sort using Comparator (by capacity)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // 🔹 Display after sorting
        System.out.println("\nAfter Sorting by Capacity (Ascending):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("==========================================");
    }
}