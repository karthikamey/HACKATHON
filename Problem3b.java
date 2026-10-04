import java.util.Scanner;

public class Problem3b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double wasteCollected = scanner.nextDouble();

        if (wasteCollected >= 100) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }

        scanner.close();
    }
}
