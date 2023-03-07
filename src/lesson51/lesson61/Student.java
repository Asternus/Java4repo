package lesson51.lesson61;

public class Student {

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void syaMyName() {
        if (this.name.equals("Lisa")) {
            System.out.println("Wrong name");
        } else {
            System.out.println(this.name);
        }
    }
}
