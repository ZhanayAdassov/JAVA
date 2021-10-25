import java.util.InputMismatchException;
import java.util.Scanner;

interface AnimalInterface{
    boolean run(double value);

    boolean swim(double value);
}
class Animal implements AnimalInterface{
    private double animalDistanceRun, animalDistanceSwim;

    Animal(double animalDistanceRun, double animalDistanceSwim) {
        this.animalDistanceRun = animalDistanceRun;
        this.animalDistanceSwim = animalDistanceSwim;
    }

    @Override
    public boolean run(double value) {
        return animalDistanceRun > value;
    }


    @Override
    public boolean swim(double value) {
        return animalDistanceSwim > value;
    }

    double getAnimalDistanceRun() {
        return animalDistanceRun;
    }

    double getAnimalDistanceSwim() {
        return animalDistanceSwim;
    }
}
class Cat extends Animal{
    Cat(double animalDistanceRun, double animalDistanceSwim) {
        super(animalDistanceRun, animalDistanceSwim);
    }
}
class Dog extends Animal{
    Dog(double animalDistanceRun, double animalDistanceSwim) {
        super(animalDistanceRun,  animalDistanceSwim);
    }
}
public class Main {

    public static void main(String[] args) throws InputMismatchException {

        Scanner scanner = new Scanner(System.in);

        double distanceRun = 200;
        double distanceSwim = 0;
        Cat cat = new Cat(distanceRun, distanceSwim);

        distanceRun = 500;
        distanceSwim = 10;
        Animal dog = new Dog(distanceRun, distanceSwim);


        System.out.println("Кошка может пробежать: " + cat.getAnimalDistanceRun() +
                " м. \nСобака может пробежать: " + dog.getAnimalDistanceRun() + " м.");

        System.out.println("Введите дистанцию для бега:");
        double distance = scanner.nextDouble();

        System.out.println("Кошка пробежал run(" + distance + "). Результат: " + cat.run(distance));
        System.out.println("Собака пробежал run(" + distance + "). Результат: " + dog.run(distance));
        System.out.println("\n****************\n");


        System.out.println("Кошка может проплыть: " + cat.getAnimalDistanceSwim() +
                " м. \nСобака может проплыть: " + dog.getAnimalDistanceSwim() + " м.");

        System.out.println("Введите дистанцию для плавания:");
        distance = scanner.nextDouble();

        System.out.println("Кошка пытается выполнить swim(" + distance + "). Результат: " + cat.swim(distance));
        System.out.println("Собака пытается выполнить swim(" + distance + "). Результат: " + dog.swim(distance));

    }


}