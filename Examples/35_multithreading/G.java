class MyThread extends Thread {
    public void run() {
        Thread y = Thread.currentThread();

        System.out.println(y);
    }
}


class A {
    public static void main(String[] args) {
        
        MyThread x = new MyThread();
        x.setName("Yam");
        x.setPriority(7);
        
        x.start();
        x.start();
    }
}