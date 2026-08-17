class MyThread extends Thread {
    public void run() {
        System.out.println("Hello World...");
    }
}


class A {
    public static void main(String[] args) {
        MyThread x = new MyThread();

        x.start();
    }
}