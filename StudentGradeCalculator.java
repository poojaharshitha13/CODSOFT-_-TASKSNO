import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = input.nextInt();

        int totalMarks = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            int marks = input.nextInt();
            totalMarks += marks;
        }

        double average = (double) totalMarks / n;

        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + average + "%");
        System.out.println("Grade: " + grade);

        input.close();
    }
}