package surajapplication;
class TestThreadTwice1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        TestThreadTwice1 t1 = new TestThreadTwice1();
        t1.start(); // First start - this will work

        try {
            // Attempting to start the same thread again
            t1.start(); // Second start - this will throw an exception
        } catch (IllegalThreadStateException e) {
            System.out.println("Exception: Cannot start the same thread twice.");
        }
    }
}
