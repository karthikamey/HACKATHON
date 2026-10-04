import java.util.Scanner;

public class Problem3c {
    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double p1 = scanner.nextDouble();
        double p2 = scanner.nextDouble();

        double total = calculateTotalWaste(p1, p2);
        System.out.println(total);

        scanner.close();
    }
}
