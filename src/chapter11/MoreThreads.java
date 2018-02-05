package chapter11;

// Create multiple threads.
class MyThread4 implements Runnable {
    int count;
    Thread thrd;
    // Construct a new thread.
    MyThread4(String name) {
        thrd = new Thread(this, name);
        count = 0;
        thrd.start(); // start the thread
    }
    // Begin execution of new thread.
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        try {
            do {
                Thread.sleep(500);
                System.out.println("In " + thrd.getName() +
                        ", count is " + count);
                count++;
            } while(count < 10);
        }
        catch(InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " terminating.");
    }
}
class MoreThreads {
    public static void main(String args[]) {
        System.out.println("Main thread starting.");
        MyThread4 mt1 = new MyThread4("Child #1");
        MyThread4 mt2 = new MyThread4("Child #2");
        MyThread4 mt3 = new MyThread4("Child #3");
        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        } while (mt1.count < 10 ||
                mt2.count < 10 ||
                mt3.count < 10);
        System.out.println("Main thread ending.");
    }
}
