// Define a class MyThread that extends the Thread class
class MyThread extends Thread {
    // Override the run method to specify the code that will be executed by the thread
    public void run() {
        // Print numbers from 1 to 5 using the current thread's ID
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getId() + " Value " + i);
        }
    }
}

// Main class that contains the main method
public class MultiThreadExample {
    // Main method where the program starts execution
    public static void main(String args[]) {
        // Create two instances of the MyThread class
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        // Start the first thread (t1)
        t1.start();
        
        // Start the second thread (t2)
        t2.start();
    }
}
