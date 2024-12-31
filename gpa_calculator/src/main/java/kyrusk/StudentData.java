package kyrusk;

import java.util.ArrayList;

public class StudentData {
    double targetGPA;
    double currentGPA;
    int creditHours;
    ArrayList<Course> courses;

    public StudentData(double targetGPA, double currentGPA, int creditHours, ArrayList<Course> courses) {
        this.targetGPA = targetGPA;
        this.currentGPA = currentGPA;
        this.creditHours = creditHours;
        this.courses = courses;
    }
        public double getTargetGPA() {
            return targetGPA;
        }
    
        public double getCurrentGPA() {
            return currentGPA;
        }
    
        public int getCreditHours() {
            return creditHours;
        }
    
        public ArrayList<Course> getCourses() {
            return courses;
        }
}