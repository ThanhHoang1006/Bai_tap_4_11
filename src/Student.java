public class Student extends Person {
    private final String studentID;

    public Student(String fullName, String studentID, String email) {
        super(fullName, email);
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return "Student: " + fullName + " - ID: " + studentID + " - Email: " + email;
    }
}
