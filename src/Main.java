public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Nguyen Van A", "SV001", "a@student.edu.vn");
        Student s2 = new Student("Tran Thi B", "SV002", "b@student.edu.vn");
        Student s3 = new Student("Le Hoang C", "SV003", "c@student.edu.vn");

        Teacher t1 = new Teacher("Dr. Pham Quoc Dung", "GV001", "dung@univ.edu.vn", "Assoc. Prof.");
        Advisor adv1 = new Advisor("Mr. Nguyen Van E", "nguyene@company.com", "FPT Software");

        ListSortable<KLTN<Student, Person>> list = new ListSortable<>();
        list.add(new KLTN<>("AI-based Traffic Prediction", s1, t1));
        list.add(new KLTN<>("Blockchain in Education", s2, adv1));
        list.add(new KLTN<>("Deep Learning for Image Recognition", s3, t1));

        System.out.println("DANH SÁCH KHOÁ LUẬN");
        list.print();
    }
}
