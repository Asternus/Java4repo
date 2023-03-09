package lesson51;

import lesson51.lesson81.Int.Animal;
import lesson51.lesson81.serv.AnimalUtils;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.name = "Rex";
        animal.type = "Dog";
        animal.id = 20;

        Animal.sayCount();

        Animal animal1 = new Animal();
        animal1.name = "Rex1";
        animal1.type = "cat";
        animal1.id = 21;

        Animal.sayCount();


        float number1 = 20.9F;
        int c = (int) number1;
        System.out.println(c);

        int number2 = 20;

        double number3 = number2;

        System.out.println(number3);

        AnimalUtils animalUtils = new AnimalUtils();
        animalUtils.craeteUtils();

        Animal animal2 = new Animal();

    }

}
