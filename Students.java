import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Students {
    private static List<Student> students = new ArrayList();

    public Students() {
    }

    public static void add(Student student) {
        students.add(student);
    }

    public static void promoteAll() {
        Iterator var0 = students.iterator();

        while(var0.hasNext()) {
            Student student = (Student)var0.next();
            student.promote();
        }

    }

    public static void displayAll() {
        Iterator var0 = students.iterator();

        while(var0.hasNext()) {
            Student student = (Student)var0.next();
            System.out.println(student.getInfo());
        }

    }
}
