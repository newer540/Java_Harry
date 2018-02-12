package chapter11;

// Suspending, resuming, and stopping a thread.
class MyThread8 implements Runnable {
    Thread thrd;
    volatile boolean suspended;
    volatile boolean stopped;
    MyThread8(String name) {
        thrd = new Thread(this, name);
        suspended = false;
        stopped = false;
        thrd.start();
    }
    // This is the entry point for thread.
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        try {
            for(int i = 1; i < 1000; i++) {
                System.out.print(i + " ");
                if((i%10)==0) {
                    System.out.println();
                    Thread.sleep(250);
                }
// Use synchronized block to check suspended and stopped.
                synchronized(this) {
                    while(suspended) {
                        wait();
                    }
                    if(stopped) break;
                }
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " exiting.");
    }
    // Stop the thread.
    synchronized void mystop() {
        stopped = true;
// The following lets a suspended thread be stopped.
        suspended = false;
        notify();
    }
    // Suspend the thread.
    synchronized void mysuspend() {
        suspended = true;
    }
    // Resume the thread.
    synchronized void myresume() {
        suspended = false;
        notify();
    }
}
class Suspend {
    public static void main(String args[]) {
        MyThread8 ob1 = new MyThread8("My Thread");
        try {
            Thread.sleep(1000); // let ob1 thread start executing
            ob1.mysuspend();
            System.out.println("Suspending thread.");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Resuming thread.");
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Suspending thread.");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Resuming thread.");
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Stopping thread.");
            ob1.mystop();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
// wait for thread to finish
        try {
            ob1.thrd.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}
