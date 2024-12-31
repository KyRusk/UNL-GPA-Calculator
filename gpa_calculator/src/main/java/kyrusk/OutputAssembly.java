package kyrusk;

import java.util.ArrayList;

public class OutputAssembly {
    public static String outputAssembly(ArrayList<ArrayList<Double>> validScenarios, ArrayList<Course> courses) {
        // Display the valid GPA scenarios
        int i;
        int f = 0;
        String output = "Valid GPA Scenarios:";
        for (ArrayList<Double> scenario : validScenarios) {
            f++;
            output = output + "\nScenario #" + f + ":";
            i = 0;
            for (Double grade : scenario) {
                output = output + "\n   " + courses.get(i).getName() + ": " + grade + "\n";
                i++;
            }
        } return output;
    }
}
