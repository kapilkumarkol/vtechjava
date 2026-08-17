class MyThread extends Thread {
    public void run() throws InterruptedException {

    }        
}

// P.java:2: error: run() in MyThread cannot implement run() in Runnable
//     public void run() throws InterruptedException {
//                 ^
//   overridden method does not throw InterruptedException
// 1 error