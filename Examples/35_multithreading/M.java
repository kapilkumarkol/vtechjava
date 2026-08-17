class MyThread extends Thread {
    public void run() {
        System.out.println("hi");
    }
}

class A {
    public static void main(String[] args) {
        MyThread t = new MyThread();

        t.start();

        System.out.println(t.isAlive());
    }
}