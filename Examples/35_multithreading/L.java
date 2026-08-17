class MyThread extends Thread {
    public void run() {

    }
}

class A {
    public static void main(String[] args) {
        MyThread t = new MyThread();

        System.out.println(t.isAlive());
    }
}