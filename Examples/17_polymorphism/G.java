class A {
    static void giveMeJumpable(Jumpable jumpable) {
        if(jumpable instanceof Ball) {
            System.out.println("I am Ball");
        } else if(jumpable instanceof SportsCar) {
            System.out.println("I am SportsCar");
        } else if(jumpable instanceof Rabbit) {
            System.out.println("I am Rabbit");
        }
        
        System.out.println("I am jumping $");
    }

    public static void main(String[] args) {
        Ball b = new Ball();        
        A.giveMeJumpable(b);

        // Rabbit r = new Rabbit();
        // A.giveMeJumpable(r);

        // SportsCar sc = new SportsCar();
        // A.giveMeJumpable(sc);
    }
}


interface Jumpable { }

class Toy { }

class Ball extends Toy implements Jumpable { }


class Animal { }

class Rabbit extends Animal implements Jumpable { }

class Car { }

class SportsCar extends Car implements Jumpable { }

