import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[3];
        students[0] = new Student("John", "Doe", "ID123", 28.5);
        students[1] = new Student("Alice", "Smith", "ID456", 24.0);
        students[2] = new Student("Bob", "Johnson", "ID789", 30.2);

        Student.printIdentifierLastLetter(students);

        System.out.println("Average Grades > 26.0:");
        for (Student student : students) {
            if (student.getAverageGrade() > 26.0) {
                System.out.println(student.getFirstName() + " " + student.getLastName() + ": " + student.getAverageGrade());
            }
        }



    }
}