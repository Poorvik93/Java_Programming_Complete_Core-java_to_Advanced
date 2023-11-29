public class MultithreadingExample {
  
    public static void main(String[] args) {
        // Create two threads
        Thread thread1 = new Thread(new NumberPrinter());
        Thread thread2 = new Thread(new LetterPrinter());
        
        // Start the threads
        thread1.start();
        thread2.start();
        
        try {
            // Wait for both threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Program execution completed.");
    }
}

class NumberPrinter implements Runnable {
  
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 1: " + i);
        }
    }
}

class LetterPrinter implements Runnable {
  
    @Override
    public void run() {
        char[] letters = {'A', 'B', 'C', 'D', 'E'};
        for (char letter : letters) {
            System.out.println("Thread 2: " + letter);
        }
    }
}
////Ecplination:-

// In this Java code, we have a `MultithreadingExample` class with a `main` method as the entry point of the program. Inside the `main` method, we create two `Thread` objects, `thread1` and `thread2`, and assign each thread to its corresponding task by passing an instance of `NumberPrinter` and `LetterPrinter` classes respectively.

// The `NumberPrinter` and `LetterPrinter` classes implement the `Runnable` interface, which allows them to be executed as separate threads. The `run` method in each class contains the code that will be executed by the respective threads.

// We start both threads using the `start()` method, which triggers the execution of the `run` method in each thread concurrently. The `join()` method is used to wait for both threads to finish before proceeding with the rest of the program.

// Finally, we print "Program execution completed." to indicate that the main program has finished executing.
