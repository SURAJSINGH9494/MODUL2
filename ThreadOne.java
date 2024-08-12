package surajapplication;

//First thread class
class ThreadOne extends Thread {
 @Override
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println("Thread One is running: " + i);
         try {
             // Sleep for 2000ms (2 seconds)
             Thread.sleep(2000);
         } catch (InterruptedException e) {
             System.out.println("Thread One was interrupted.");
         }
     }
 }
}

//Second thread class
class ThreadTwo extends Thread {
 @Override
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println("Thread Two is running: " + i);
         try {
             // Sleep for 2000ms (2 seconds)
             Thread.sleep(2000);
         } catch (InterruptedException e) {
             System.out.println("Thread Two was interrupted.");
         }
     }
 }

 public static void main(String[] args) {
     // Create instances of the two threads
     ThreadOne threadOne = new ThreadOne();
     ThreadTwo threadTwo = new ThreadTwo();

     // Start the threads
     threadOne.start();
     threadTwo.start();
 }
}
