import java.util.Scanner;

class hackathon2 {
    String studentName;
    String rollNumber;
    double marks;
    String courseName;
    int courseCredits;
    double fee;
    double scholarship;
    double finalFee;

    public Student(String studentName, String rollNumber, double marks, String courseName, int courseCredits) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }

    public double calculateFee() {
        this.fee = this.courseCredits * 1500;
        return this.fee;
    }

    public boolean checkEligibility() {
        return this.marks >= 50;
    }

    public double calculateScholarship() {
        if (this.marks >= 85) {
            this.scholarship = 0.20 * this.fee;
        } else if (this.marks >= 70 && this.marks <= 84) {
            this.scholarship = 0.10 * this.fee;
        } else {
            this.scholarship = 0;
        }
        return this.scholarship;
    }

    public double calculateFinalFee() {
        this.finalFee = this.fee - this.scholarship;
        return this.finalFee;
    }

    public void displayDetails() {
        System.out.println("\n--- Student Registration Details ---");
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Credits: " + courseCredits);
        System.out.println("Eligibility: " + (checkEligibility() ? "Eligible" : "Not Eligible"));
        System.out.println("Total Fee: Rs. " + fee);
        System.out.println("Scholarship: Rs. " + scholarship);
        System.out.println("Final Fee: Rs. " + finalFee);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String roll = scanner.nextLine();
        double marks = scanner.nextDouble();
        scanner.nextLine(); 
        String course = scanner.nextLine();
        int credits = scanner.nextInt();

        Student student = new Student(name, roll, marks, course, credits);

        if (student.checkEligibility()) {
            student.calculateFee();
            student.calculateScholarship();
            student.calculateFinalFee();
            student.displayDetails();
        } else {
            System.out.println("Student is not eligible for registration.");
        }

        scanner.close();
    }
}
