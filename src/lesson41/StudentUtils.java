package lesson41;

public class StudentUtils {

    Student1 student1;

    public StudentUtils(Student1 student1) {
        this.student1 = student1;
    }


    Student1 getStudent() {
        if (student1 == null) {
            return new Student1();
        }
        return student1;
    }

}
