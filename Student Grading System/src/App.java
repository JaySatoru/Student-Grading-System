import java.util.Scanner;

public class App{
    public static void main(String[] args){
        try (Scanner s = new Scanner(System.in)) {
            Course c1 = new Course();
            Course c2 = new Course();

            Student undergrad = new UnderGraduate();
            Student grad = new GraduateStudent();

            System.out.println("Enter Course1 name: ");
            c1.setCourseName(s.next());

            System.out.println("Enter Course2 name: ");
            c2.setCourseName(s.next());

            System.out.println("Enter the Undergraduate name and id: ");
            undergrad.setName(s.next());
            undergrad.setId(s.nextInt());

            System.out.println("Enter the Score for Course1 for Undergraduate Student: ");
            undergrad.addGrade(c1, s.nextDouble());

            System.out.println("Enter the Score for Course2 for Undergraduate Student: ");
            undergrad.addGrade(c2, s.nextDouble());

            System.out.println("Enter the Graduate name and id: ");
            grad.setName(s.next());
            grad.setId(s.nextInt());

            System.out.println("Enter the Score for Course1 for Graduate Student: ");
            grad.addGrade(c1, s.nextDouble());

            System.out.println("Enter the Score for Course2 for Graduate Student: ");
            grad.addGrade(c2, s.nextDouble());

            System.out.println("Printing the details of Students:");
            undergrad.printGrades();
            grad.printGrades();
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
