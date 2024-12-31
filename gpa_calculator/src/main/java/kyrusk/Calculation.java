package kyrusk;

import java.util.ArrayList;

public class Calculation {

    // Static method for GPA calculation scenario
    public static ArrayList<ArrayList<Double>> calculateGpaScenarios(StudentData studentData) {
        double currentPoints = studentData.getCurrentGPA() * studentData.getCreditHours();
        int semesterCredits = studentData.getCourses().stream().mapToInt(course -> course.credits).sum();
        double targetPoints = studentData.getTargetGPA() * (semesterCredits + studentData.getCreditHours()) - currentPoints;

        double[] multipliers = {0.0, 1.0, 1.33, 1.67, 2.0, 2.33, 2.67, 3.0, 3.33, 3.67, 4.0};
        ArrayList<ArrayList<Double>> validScenarios = new ArrayList<>();

        findGpaScenarios(studentData.getCourses(), new ArrayList<>(), 0, multipliers, targetPoints, validScenarios);

        // Display results
        return validScenarios;
    }

    // Recursive method to find GPA scenarios
    private static void findGpaScenarios(
            ArrayList<Course> courses,
            ArrayList<Double> currentScenario,
            int index,
            double[] multipliers,
            double targetPoints,
            ArrayList<ArrayList<Double>> validScenarios) {

        if (index == courses.size()) {
            double totalPoints = 0.0;
            for (int i = 0; i < courses.size(); i++) {
                totalPoints += courses.get(i).credits * currentScenario.get(i);
            }
            if (totalPoints >= targetPoints) {
                validScenarios.add(new ArrayList<>(currentScenario));
            }
            return;
        }

        Course currentCourse = courses.get(index);
        for (double multiplier : multipliers) {
            if (multiplier >= currentCourse.minimumGrade) {
                currentScenario.add(multiplier);
                findGpaScenarios(courses, currentScenario, index + 1, multipliers, targetPoints, validScenarios);
                currentScenario.remove(currentScenario.size() - 1); // Backtrack
            }
        }
    }
}
