package kyrusk;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Collect data and get the StudentData object
        StudentData studentData = InputCollection.collectCourseData();

        // Call the Calculation class's method to calculate GPA scenarios
        ArrayList<ArrayList<Double>> gpaScenarios = Calculation.calculateGpaScenarios(studentData);

        //Creates and displays the result output
        System.out.println(OutputAssembly.outputAssembly(gpaScenarios, studentData.getCourses()));
    }
}