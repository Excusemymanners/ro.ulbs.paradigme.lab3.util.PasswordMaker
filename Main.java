import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<Student>(); //clasa ArrayList(clasa) implementeaza interfata List(interfata)
        student.add(new Student("Ana", 1));
        student.add(new Student("Bogdan", 2));
        student.add(new Student("Casian", 3));
        student.add(new Student("Daria", 4));
        student.add(new Student("Elena", 5));

        for (Student s : student) {
            System.out.println("Name:" + s.getName() + " " + "ID:" + s.getID());
        }

        Map<Integer, Student> studentsByID = new HashMap<>();
    }
}



