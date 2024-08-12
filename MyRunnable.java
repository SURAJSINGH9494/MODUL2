package surajapplication;
//Implementing the Runnable interface
class MyRunnable implements Runnable {
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
     // Create an instance of MyRunnable
     MyRunnable myRunnable = new MyRunnable();
     
     // Create a Thread with the Runnable instance
     Thread thread = new Thread(myRunnable);
     
     // Start the thread
     thread.start();
     
     // Main thread continues executing in parallel
     System.out.println("Main thread is running.");
 }
}
