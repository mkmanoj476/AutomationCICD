package JavaEight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortTest {

    public static int comapreByAge(Student s1, Student s2){
        return s1.getAge()-(s2.getAge());
    }
    public static int compageByName(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Manoj", 31));
        students.add(new Student("Amit", 38));
        students.add(new Student("Rohit", 16));
        students.add(new Student("Sahil", 23));

        Collections.sort(students, SortTest::comapreByAge);

        System.out.println("Sorted based on Age");

        students.stream()
                        .map(x-> x.getAge())
                                .forEach(System.out::println);

        System.out.println("Sorted based on Name");

        Collections.sort(students, SortTest::compageByName);
        students.stream()
                .map(x-> x.getName())
                .forEach(System.out::println);


    }
}
