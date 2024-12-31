package kyrusk;

import java.util.ArrayList;
import java.util.Scanner;

public class InputCollection {
    // Method to get grade points based on letter grade
    private static double getGradePoints(String gradeLetter) {
        switch (gradeLetter) {
            case "A+":
                return 100.0;
            case "A":
                return 93.3;
            case "A-":
                return 90.0;
            case "B+":
                return 86.7;
            case "B":
                return 83.3;
            case "B-":
                return 80.0;
            case "C+":
                return 76.7;
            case "C":
                return 73.3;
            case "C-":
                return 70.0;
            case "D+":
                return 66.7;
            case "D":
                return 63.3;
            case "D-":
                return 60.0;
            default:
                return 0.0;
        }
    }

    public static StudentData collectCourseData() {
        Scanner scanner = new Scanner(System.in);

        // Collect general information
        System.out.print("Target GPA: ");
        final double targetGPA = scanner.nextDouble();

        System.out.print("Current Cumulative GPA: ");
        final double currentGPA = scanner.nextDouble();

        System.out.print("Completed Credit Hours: ");
        final int creditHours = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading integer

        // Input courses
        ArrayList<Course> courses = new ArrayList<>();
        System.out.println("Input Semester Schedule Data");

        while (true) {
            System.out.print("Course Name: ");
            String courseName = scanner.nextLine();

            System.out.print("'" + courseName + "' Credit Hours: ");
            int courseCredits = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Minimum Grade Letter: ");
            String gradeLetter = scanner.nextLine().toUpperCase();
            double minimumGrade = getGradePoints(gradeLetter);

            // Create Course object and add to list
            courses.add(new Course(courseName, courseCredits, minimumGrade));

            System.out.print("Have you entered all courses (Y/N): ");
            String done = scanner.nextLine().toUpperCase();
            if (done.equals("Y")) {
                break;
            }
        }

        scanner.close(); // Close the scanner when done

        return new StudentData(targetGPA, currentGPA, creditHours, courses);    }
}