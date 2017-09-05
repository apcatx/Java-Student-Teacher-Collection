import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Action", "Jackson", 0, 1));
        students.add(new Student("Wesley", "Snipes", 1, 1));
        students.add(new Student("The", "Dude", 2, 1));
        students.add(new Student("Harry", "Potter", 3, 1));
        students.add(new Student("Ron", "White", 4, 1));
        students.add(new Student("Thurgood", "Jenkins", 5, 1));
        students.add(new Student("Jason", "Born", 6, 1));
        students.add(new Student("Count", "Cristo", 7, 1));
        students.add(new Student("Bill", "Murray", 8, 1));
        students.add(new Student("Max", "Frost", 9, 1));
        students.add(new Student("Peter", "Fleck", 10, 1));
        students.add(new Student("Shawn", "Murray", 11, 1));
        students.add(new Student("Payne", "Stewart", 12, 1));
        students.add(new Student("Arnold", "Palmer", 13, 1));
        students.add(new Student("Austin", "Carey", 14, 1));

        HashSet<Student> class1 = new HashSet<>();
        class1.add(students.get( 0 ));
        class1.add(students.get( 1 ));
        class1.add(students.get( 2 ));
        class1.add(students.get( 3 ));
        class1.add(students.get( 4 ));

        HashSet<Student> class2 = new HashSet<>();
        class2.add(students.get( 5 ));
        class2.add(students.get( 6 ));
        class2.add(students.get( 7 ));
        class2.add(students.get( 8 ));
        class2.add(students.get( 9 ));

        HashSet<Student> class3 = new HashSet<>();
        class3.add(students.get( 10 ));
        class3.add(students.get( 11 ));
        class3.add(students.get( 12 ));
        class3.add(students.get( 13 ));
        class3.add(students.get( 14 ));

        ArrayList<Teacher> teachers = new ArrayList<>();

        teachers.add(new Teacher("Riley", "Hutton", 20, 1));
        teachers.add(new Teacher("Dan", "Magone", 21, 1));
        teachers.add(new Teacher("Brandon", "Trust", 22, 1));


        HashMap<Teacher, HashSet> rollCall = new HashMap<>();
        rollCall.put(teachers.get(0), class1);
        rollCall.put(teachers.get(1), class2);
        rollCall.put(teachers.get(2), class3);

        for (Teacher educators : rollCall.keySet()) {
            System.out.println( educators );
        }

        for (HashSet educated : rollCall.values()) {
            System.out.println( educated );

        }

    }
}