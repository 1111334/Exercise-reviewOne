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


    public void printIdentifierLastLetter() {
        char lastLetter = identifier.charAt(identifier.length() - 1);
        System.out.println("Last character of the identifier: " + lastLetter);
    }


}
