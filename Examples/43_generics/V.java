import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<? extends Animal> x = process();

        System.out.println(x);
    }

    static ArrayList<? extends Animal> process() {
        // ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<Dog> dogs = new ArrayList<>();

        // cats.add(new Cat());
        dogs.add(new Dog());

        return dogs;
    }
}