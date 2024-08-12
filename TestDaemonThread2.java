package surajapplication;

class TestDaemonThread2 extends Thread {
    @Override
    public void run() {
        if (isDaemon()) {
            System.out.println(Thread.currentThread().getName() + " is a daemon thread.");
        } else {
            System.out.println(Thread.currentThread().getName() + " is a user thread.");
        }
    }
    public static void main(String[] args) {
        TestDaemonThread2 t1 = new TestDaemonThread2();
        TestDaemonThread2 t2 = new TestDaemonThread2();

        // Setting t1 as a daemon thread before starting it
        t1.setDaemon(true);
        
        // Starting both threads
        t1.start();
        t2.start();

        // Checking the status of threads
        System.out.println("Thread t1 isDaemon: " + t1.isDaemon());
        System.out.println("Thread t2 isDaemon: " + t2.isDaemon());
    }
}
