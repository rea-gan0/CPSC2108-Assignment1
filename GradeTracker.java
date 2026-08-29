
import java.util.Scanner;

public class GradeTracker {

    public static double calculateAverage(double[] grades) {
        double total = 0;

        for (int i = 0; i < grades.length; i++) {
            total += grades[i];
        }

        return total / grades.length;
    }

    public static double findHighestGrade(double[] grades) {
        double highest = grades[0];

        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > highest) {
                highest = grades[i];
            }
        }

        return highest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter course name: ");
        String course = input.nextLine();

        Student student = new Student(name, course);

        System.out.print("How many grades would you like to enter? ");
        int numberOfGrades = input.nextInt();

        double[] grades = new double[numberOfGrades];

        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = input.nextDouble();
        }

        double average = calculateAverage(grades);
        double highest = findHighestGrade(grades);

        System.out.println("\n--- Grade Summary ---");
        student.displayStudentInfo();
        System.out.printf("Average Grade: %.2f%n", average);
        System.out.printf("Highest Grade: %.2f%n", highest);

        if (average >= 90) {
            System.out.println("Overall Letter Grade: A");
        } else if (average >= 80) {
            System.out.println("Overall Letter Grade: B");
        } else if (average >= 70) {
            System.out.println("Overall Letter Grade: C");
        } else if (average >= 60) {
            System.out.println("Overall Letter Grade: D");
        } else {
            System.out.println("Overall Letter Grade: F");
        }

        input.close();
    }
}
