package lesson51.lesson81.Int;

import lesson51.lesson61.Student;

public class Animal {

    public static int count;
    public int id;

    public String name;

    public String type;

    Student student;

    static {
        count = 100;
    }

    {
        count -= 20;
    }

    public Animal() {
        count++;
    }

    static public void sayCount() {
        System.out.println(count);
    }

}
