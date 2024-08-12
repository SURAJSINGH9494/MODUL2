package surajapplication;

//Extending the Thread class
class MyThread extends Thread {
 @Override
 public void run() {
     // Code to be executed in the thread
     for (int i = 1; i <= 5; i++) {
         System.out.println("Thread is running: " + i);
         try {
             // Sleep for a short time to simulate work
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             System.out.println("Thread was interrupted.");
         }
     }
 }

 public static void main(String[] args) {
     // Create an instance of MyThread
     MyThread thread = new MyThread();
     
     // Start the thread
     thread.start();
     
     // Main thread continues executing in parallel
     System.out.println("Main thread is running.");
 }
}
