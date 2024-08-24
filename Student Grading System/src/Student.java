import java.util.HashMap;
import java.util.Map;

public abstract class Student{
    private String name;
    private int id;
    private Map<Course, Grade> grades = new HashMap<>();

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public void addGrade(Course course, double score){
        grades.put(course, new Grade(score));
    }

    public double calculateGPA(){
        if(grades.isEmpty()) {
            return 0.0;
        }

        double totalGradePoints = 0.0;
        for(Grade grade : grades.values()){
            totalGradePoints += scoreToGradePoint(grade.getScore());
        }

        return totalGradePoints / grades.size();
    }

    private double scoreToGradePoint(double score){
        if(score >= 90){
            return 4.0;
        }
        else if (score >= 80){
            return 3.0;
        }
        else if (score >= 70){
            return 2.0;
        }
        else if (score >= 60){
            return 1.0;
        }
        else{
            return 0.0;
        }
    }

    public void printGrades(){
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        for (Map.Entry<Course, Grade> entry : grades.entrySet()) {
            System.out.println("Course: " + entry.getKey().getCourseName() + " | Score: " + entry.getValue().getScore());
        }
        System.out.println("GPA: " + calculateGPA());
        System.out.println();
    }
}
