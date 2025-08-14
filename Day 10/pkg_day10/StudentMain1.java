package pkg_day10;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StudentMain1 {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Garry", 21));
        list.add(new Student("Binny", 26));
        list.add(new Student("Fenny", 22));

        // Sort by Age - First Approach
        System.out.println("Before sorting: The age of the Students");
        for (Student sage : list) {
            System.out.println(sage.getAge());
        }

        System.out.println("After sorting: The age of the Students");
        Collections.sort(list, new AgeComparator());
        for (Student sage : list) {
            System.out.println(sage.getAge());
        }

        // Sort by Name
        System.out.println("Before sorting: The name of the Students");
        for (Student name : list) {
            System.out.println(name.getName());
        }

        System.out.println("After sorting: The name of the Students");
        Collections.sort(list, new NameComparator());
        for (Student name : list) {
            System.out.println(name.getName());
        }

        // Second Approach - Using Anonymous class
        System.out.println("After sorting: The age of the Students using anonymous class");
        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getAge(), s2.getAge());
            }
        });

        for (Student sage : list) {
            System.out.println(sage.getAge());
        }

        // Third Approach - Using Lambda Expression
        System.out.println("After sorting: The age of the Students using lambda");
        list.sort((s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()));

        list.forEach(System.out::println);
    }
}
