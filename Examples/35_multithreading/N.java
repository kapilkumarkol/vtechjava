class MyThread extends Thread {
    public void run() {
        System.out.println("hello chacha");
    }
}

class A {
    public static void main(String[] args) {
        MyThread t = new MyThread();

        t.start();

        for(int i=0;i<300;i++) {
            System.out.println(i);
        }

        System.out.println(t.isAlive());
    }
}