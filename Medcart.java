import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Medicine {
    int id;
    String name;
    double price;

    Medicine(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class MedCart {
    static List<Medicine> medicines = new ArrayList<>();
    static List<Medicine> cart = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeMedicines();
        System.out.println("Welcome to MedCart!");
        boolean running = true;
        while (running) {
            System.out.println("\nSelect an option:");
            System.out.println("1. View Medicines");
            System.out.println("2. View Cart");
            System.out.println("3. Checkout");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> viewMedicines();
                case 2 -> viewCart();
                case 3 -> checkout();
                case 4 -> {
                    System.out.println("Exiting MedCart. Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void initializeMedicines() {
        medicines.add(new Medicine(1, "Paracetamol", 10));
        medicines.add(new Medicine(2, "Ibuprofen", 15));
        medicines.add(new Medicine(3, "Aspirin", 12));
        medicines.add(new Medicine(4, "Vitamin C", 8));
    }

    private static void viewMedicines() {
        System.out.println("\nAvailable Medicines:");
        for (Medicine med : medicines) {
            System.out.println(med.id + ". " + med.name + " - ₹" + med.price);
        }
        System.out.println("Enter medicine ID to add to cart (0 to go back):");
        int medId = scanner.nextInt();
        scanner.nextLine();
        if (medId == 0) return;

        Medicine selected = medicines.stream()
                .filter(m -> m.id == medId)
                .findFirst()
                .orElse(null);

        if (selected != null) {
            cart.add(selected);
            System.out.println(selected.name + " added to cart.");
        } else {
            System.out.println("Invalid medicine ID.");
        }
    }

    private static void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("\nYour cart is empty.");
            return;
        }
        System.out.println("\nYour Cart:");
        double total = 0;
        for (Medicine med : cart) {
            System.out.println(med.name + " - ₹" + med.price);
            total += med.price;
        }
        System.out.println("Total: ₹" + total);
    }

    private static void checkout() {
        if (cart.isEmpty()) {
            System.out.println("\nYour cart is empty. Nothing to checkout.");
            return;
        }
        viewCart();
        System.out.println("\nChecking out...");
        cart.clear();
        System.out.println("Thank you for shopping at MedCart!");
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Medicine {
    int id;
    String name;
    double price;

    Medicine(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class MedCart {
    static List<Medicine> medicines = new ArrayList<>();
    static List<Medicine> cart = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeMedicines();
        System.out.println("Welcome to MedCart!");
        boolean running = true;
        while (running) {
            System.out.println("\nSelect an option:");
            System.out.println("1. View Medicines");
            System.out.println("2. View Cart");
            System.out.println("3. Checkout");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> viewMedicines();
                case 2 -> viewCart();
                case 3 -> checkout();
                case 4 -> {
                    System.out.println("Exiting MedCart. Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void initializeMedicines() {
        medicines.add(new Medicine(1, "Paracetamol", 10));
        medicines.add(new Medicine(2, "Ibuprofen", 15));
        medicines.add(new Medicine(3, "Aspirin", 12));
        medicines.add(new Medicine(4, "Vitamin C", 8));
    }

    private static void viewMedicines() {
        System.out.println("\nAvailable Medicines:");
        for (Medicine med : medicines) {
            System.out.println(med.id + ". " + med.name + " - ₹" + med.price);
        }
        System.out.println("Enter medicine ID to add to cart (0 to go back):");
        int medId = scanner.nextInt();
        scanner.nextLine();
        if (medId == 0) return;

        Medicine selected = medicines.stream()
                .filter(m -> m.id == medId)
                .findFirst()
                .orElse(null);

        if (selected != null) {
            cart.add(selected);
            System.out.println(selected.name + " added to cart.");
        } else {
            System.out.println("Invalid medicine ID.");
        }
    }

    private static void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("\nYour cart is empty.");
            return;
        }
        System.out.println("\nYour Cart:");
        double total = 0;
        for (Medicine med : cart) {
            System.out.println(med.name + " - ₹" + med.price);
            total += med.price;
        }
        System.out.println("Total: ₹" + total);
    }

    private static void checkout() {
        if (cart.isEmpty()) {
            System.out.println("\nYour cart is empty. Nothing to checkout.");
            return;
        }
        viewCart();
        System.out.println("\nChecking out...");
        cart.clear();
        System.out.println("Thank you for shopping at hello");
    }
}
