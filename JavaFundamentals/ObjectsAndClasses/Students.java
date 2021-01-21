import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String line = scan.nextLine();

        while (!line.equals("end")) {
            String[] studentParameters = line.split(" ");
            Student s = new Student(studentParameters[0], studentParameters[1], Integer.parseInt(studentParameters[2]), studentParameters[3]);

            //USING OVERWRITE METHOD
            int existingIndex = findStudentIndex(students, s.getFirstName(), s.getLastName());
            if (existingIndex != -1) {
                students.get(existingIndex).setCity(s.city);
                students.get(existingIndex).setAge(s.age);
            } else {
                students.add(s);
            }

            line = scan.nextLine();
        }
        String searchForCity = scan.nextLine();
        for (Student student : students) {
            if (student.getCity().equals(searchForCity)) {
                System.out.printf("%s %s is %d years old \n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }

    //OVERWRITE METHOD
    static int findStudentIndex(List<Student> students, String firstName, String lastName) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getFirstName().equals(firstName) && students.get(i).getLastName().equals(lastName)) {
                return i;
            }
        }
        return -1;
    }


    //CLASS
    static class Student {
        String firstName;
        String lastName;
        int age;
        String city;

        //CONSTRUCTOR
        public Student(String firstName, String secondName, int age, String city) {
            this.firstName = firstName;
            this.lastName = secondName;
            this.age = age;
            this.city = city;
        }

        //GETTER
        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getCity() {
            return city;
        }

        //SETTER
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }
}
