package chapter11;

// Use join().
class MyThread5 implements Runnable {
    int count;
    Thread thrd;
    // Construct a new thread.
    MyThread5(String name) {
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
class JoinThreads {
    public static void main(String args[]) {
        System.out.println("Main thread starting.");
        MyThread5 mt1 = new MyThread5("Child #1");
        MyThread5 mt2 = new MyThread5("Child #2");
        MyThread5 mt3 = new MyThread5("Child #3");
        try {
            mt1.thrd.join();
            System.out.println("Child #1 joined.");
            mt2.thrd.join();
            System.out.println("Child #2 joined.");
            mt3.thrd.join();
            System.out.println("Child #3 joined.");
        }
        catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread ending.");
    }
}
