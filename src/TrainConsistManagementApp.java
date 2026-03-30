import java.util.ArrayList;
import java.util.List;

// Base class for all bogies
class Bogie {
    protected String id;
    protected String type;

    public Bogie(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public String getDetails() {
        return "Bogie ID: " + id + ", Type: " + type;
    }
}

// Train class managing consist
class Train {
    private String trainId;
    private List<Bogie> bogies;

    public Train(String trainId) {
        this.trainId = trainId;
        this.bogies = new ArrayList<>();
    }

    public void displaySummary() {
        System.out.println("===== TRAIN CONSIST SUMMARY =====");
        System.out.println("Train ID: " + trainId);

        if (bogies.isEmpty()) {
            System.out.println("No bogies attached to the train.");
        } else {
            System.out.println("Total Bogies: " + bogies.size());
            for (Bogie b : bogies) {
                System.out.println(b.getDetails());
            }
        }
        System.out.println("=================================");
    }
}

// Main Application Class
public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Initialize train
        Train train = new Train("TRAIN-101");

        // Display initial state
        train.displaySummary();
    }
}