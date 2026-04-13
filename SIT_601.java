// Multithreading in Java
// Multithreading with Synchronization

// 1) Normal Sync
// 2) Method level Sync
// 3) Block level Sync
// 4) Static level Sync

// Multithreading
// Step 1: import java.lang pkg.
// Step 2: A) By extending the Thread class
//         B) By implementing the Runnable interface (best approach)
// Step 3: Initialize the run() method
// Step 4: 
// Step 5: Implemented the run() method. (Most imp method)
// Step 6: Create the number of threads.
// Step 7: Start all the threads.

import java.lang.InterruptedException;

class SingleT601 extends Thread{
    public void run(){
        try{
            for(int i = 1; i <= 3; i++){
                System.out.println("Bye SIT");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class SIT_601 {
    public static void main(String[] args) {

        SingleT601 op = new SingleT601();
        op.start();


        try{
            for(int i = 1; i <= 3; i++){
                System.out.println("Hello SIT");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            
        }
        
    }
}
