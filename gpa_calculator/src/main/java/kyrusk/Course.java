package kyrusk;

public class Course {
    String name;
    int credits;
    double minimumGrade;

    public Course(String name, int credits, double minimumGrade) {
        this.name = name;
        this.credits = credits;
        this.minimumGrade = minimumGrade;
    }
    
    public String getName() {
        return name;
    }
    
    public int getCredits() {
        return credits;
    }
    
    public double getMinimumGrade() {
        return minimumGrade;
    }
}
