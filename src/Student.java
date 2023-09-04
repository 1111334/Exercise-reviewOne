public class Student {
   private String firstName;
   private String lastName;
    private String identifier;
    private double averageGrade;

    public Student(String firstName, String lastName, String identifier, double averageGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identifier = identifier;
        this.averageGrade = averageGrade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getIdentifier() {
        return identifier;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public static void printIdentifierLastLetter(Student[] students) {
        for (Student student : students) {
            String identifier = student.getIdentifier();
            int identifierLength = identifier.length();
            if (identifierLength > 0) {
                char lastLetter = identifier.charAt(identifierLength - 1);
                System.out.println("Last letter of identifier for " + student.firstName + " " + student.lastName + ": " + lastLetter);
            }
        }
    }


}
