public class KLTN<T extends Student, V extends Person> implements Comparable<KLTN<T, V>> {
    private final String title;
    private final T student;
    private final V superVisor;

    public KLTN(String title, T student, V superVisor) {
        this.title = title;
        this.student = student;
        this.superVisor = superVisor;
    }

    public String getThesisTitle() {
        return title;
    }

    public T getStudent() {
        return student;
    }

    public V getSuperVisor() {
        return superVisor;
    }

    @Override
    public int compareTo(KLTN<T, V> other) {
        return this.title.compareToIgnoreCase(other.title);
    }

    @Override
    public String toString() {
        return title + "\n " + student + "\n superVisor: " + superVisor + "\n";
    }
}

