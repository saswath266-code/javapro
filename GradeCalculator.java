import java.util.Scanner;

public class GradeCalculator {

    // Simple method to calculate standard letter grade
    public static String calculateGrade(double percentage) {
        if (percentage >= 90) {
            return "A";
        } else if (percentage >= 80) {
            return "B";
        } else if (percentage >= 70) {
            return "C";
        } else if (percentage >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        // Create standard Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Predefined array of your 5 selected subjects from the image
        String[] subjects = {
            "Artificial Intelligence",
            "Data Structures",
            "AI & DS II",
            "Digital Principles",
            "Data Exploration"
        };

        double totalMarks = 0.0;

        System.out.println("--- Enter Marks for Your 5 Subjects (Out of 100) ---");

        // Loop through each subject to get input
        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Enter marks for " + subjects[i] + ": ");
            double marks = scanner.nextDouble();
            totalMarks = totalMarks + marks; 
        }

        // Calculate average percentage
        double averagePercentage = totalMarks / subjects.length;
        String finalGrade = calculateGrade(averagePercentage);

        // Display the final output
        System.out.println("\n--- Report Card ---");
        System.out.println("Total Marks: " + totalMarks + " / 500");
        System.out.println("Percentage: " + averagePercentage + "%");
        System.out.println("Final Grade: " + finalGrade);

        scanner.close();
    }
}
