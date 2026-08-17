class A {
    static void giveMeJumpable(Jumpable jumpable) {
        System.out.println("I am jumping $");
    }
    
    // static void giveMeBall(Ball ball) {
    //     System.out.println("I am jumping -");
    // }

    // static void giveMeRabbit(Rabbit rabbit) {
    //     System.out.println("I am Jumping #");
    // }

    // static void giveMeSportsCar(SportsCar sportsCar) {
    //     System.out.println("I am Jumping ~");
    // }


    public static void main(String[] args) {
        Ball b = new Ball();        
        A.giveMeJumpable(b);

        Rabbit r = new Rabbit();
        A.giveMeJumpable(r);

        SportsCar sc = new SportsCar();
        A.giveMeJumpable(sc);
    }
}


interface Jumpable { }

class Toy { }

class Ball extends Toy implements Jumpable { }


class Animal { }

class Rabbit extends Animal implements Jumpable { }

class Car { }

class SportsCar extends Car implements Jumpable { }

