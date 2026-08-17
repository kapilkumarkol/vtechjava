import java.util.Scanner;

class Producer extends Thread {
    public void run() {
        while(true) {
            A.circle.writeRadius();
        }
    }
}

class Consumer extends Thread {
    public void run() {
        while(true) {
            A.circle.readRadius();
        }
    }
}

class A {
    static Circle circle = new Circle();
    public static void main(String[] args) {
        Producer producer = new Producer();
        producer.setName("Producer");

        Consumer consumer = new Consumer();
        consumer.setName("Consumer");

        producer.start();
        consumer.start();
    }
}

class Circle {
    private int radius;

    Scanner sc = new Scanner(System.in);

    public synchronized void writeRadius() {
        Thread t = Thread.currentThread();

        if(radius == 0) {
            System.out.print(t.getName() + " please enter radius: ");
            radius = sc.nextInt();
            notify();    
        } else {
            System.out.println(t.getName() + " is going to wait ...");
            try { wait(); } catch(InterruptedException e) { e.printStackTrace(); }    
        }
    }

    public synchronized void readRadius() {
        Thread t = Thread.currentThread();

        if(radius != 0) {
            System.out.println(t.getName() + " read the value: " + radius);
            radius = 0;
            notify();
        } else {
            System.out.println(t.getName() + " is going to wait ...");
            try { wait(); } catch(InterruptedException e) { e.printStackTrace(); }    
        }
    }
}