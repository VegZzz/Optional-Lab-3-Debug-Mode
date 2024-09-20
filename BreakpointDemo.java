import java.util.Random;

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println(name + " makes a sound.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " barks."); // breakpoint: examine function calling stack and caller
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " meows."); // breakpoint: examine function calling stack
    }
}

public class BreakpointDemo {
    public static void main(String[] args) {
        Random random = new Random();
        Animal[] animals = new Animal[5];

        for (int i = 0; i < animals.length; i++) { // breakpoint: examine loop
            if (random.nextBoolean()) {
                animals[i] = new Dog("Dog-" + i);
            } else {
                animals[i] = new Cat("Cat-" + i);
            }
        }

        int randomIndex = random.nextInt(animals.length); // breakpoint: examine Stack and Heap
        Animal selectedAnimal = animals[randomIndex];

        int initialDepth = 4;

        performRandomActions(selectedAnimal, initialDepth, random);
    }

    static void performRandomActions(Animal animal, int depth, Random random) {
        if (depth == 0) { // breakpoint: examine function calling stack
            System.out.println("Recursion ends at depth 0");
            return;
        }

        System.out.println("Current recursion depth: " + depth);

        if (random.nextBoolean()) {
            feedAnimal(animal); // breakpoint: examine begin of branch
            System.out.println("Desmond likes feeding cats, but Yinqgi likes feeding dogs.");
        } else {
            playWithAnimal(animal); // breakpoint: examine begin of branch
            System.out.println("Desmond likes playing with dogs, but Yinqgi likes playing with cats.");
        }

        performRandomActions(animal, depth - 1, random);
    }

    static void feedAnimal(Animal animal) {
        System.out.println("Feeding " + animal.name);

        if (animal instanceof Dog) {
            System.out.println(animal.name + " loves the food!");
        } else if (animal instanceof Cat) {
            System.out.println(animal.name + " is picky about the food.");
        }
    }

    static void playWithAnimal(Animal animal) {
        System.out.println("Playing with " + animal.name);

        animal.sound();
    }
}