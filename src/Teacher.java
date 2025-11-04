public class Teacher extends Person {
    private final String teacherID;
    private final String title;

    public Teacher(String fullName, String teacherID, String email, String title) {
        super(fullName, email);
        this.teacherID = teacherID;
        this.title = title;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Teacher: " + title + " " + fullName + " - ID: " + teacherID + " - Email: " + email;
    }
}
