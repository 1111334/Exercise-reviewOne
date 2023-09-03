public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[3];
        students[0] = new Student("John", "Doe", "S123", 85.5);
        students[1] = new Student("Alice", "Smith", "S456", 92.0);
        students[2] = new Student("Bob", "Johnson", "S789", 78.3);

        for (Student student : students) {
            student.printIdentifierLastLetter();
        }
    }
}