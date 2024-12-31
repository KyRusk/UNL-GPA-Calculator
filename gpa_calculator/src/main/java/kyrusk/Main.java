package kyrusk;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Current Cumulative GPA: ");
        Double currentGPA = scanner.nextDouble();
        System.out.print("Completed Credit Hours: ");
        int creditHours = scanner.nextInt();

        System.out.println("Input Semester Schedule Data");
        while (true) {
            System.out.print("Course Name: ");
            //Register name

            System.out.print("Course's Credit Hours:");
            //Register Credit Hours

            System.out.print("Minimum Grade Letter: ");
            //Register Minimum Grade Letter
            System.out.print("Have you entered all Courses: ");
            
            scanner.close();
        }
    }
    public Double letterToGrade(String gradeLetter) {
        if (gradeLetter == "A+" || gradeLetter == "A") {
            return 4.0;
        } else if (gradeLetter == "A-") {  
            return 3.67;
        } else if (gradeLetter == "B+") {
            return 3.33;
        } else if (gradeLetter == "B") {
            return 3.0;
        } else if (gradeLetter == "B-") {
            return 2.67;
        } else if (gradeLetter == "C+") {
            return 2.33;
        } else if (gradeLetter == "C") {
            return 2.00;
        } else if (gradeLetter == "C-") {
            return 1.67;
        } else if (gradeLetter == "D+") {
            return 1.33;
        } else if (gradeLetter == "D") {
            return 1.00;
        } else if (gradeLetter == "F") {
            return 0.00;
        } else {
            return null;
        }
    }
}