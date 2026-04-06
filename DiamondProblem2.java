// Q; Payment Gateway system: An e-commerce website uses UPI Payment and Card Payment.
// Both have processPayment() method. A Hybrid Payment System supports both

import java.util.Scanner;

interface UPIPayment {

    default void processPayment(){
        System.out.println("Payment done using UPI.");
    }
}

interface CardPayment {

    default void processPayment(){
        System.out.println("Payment done using Card.");
    }
}

class HybridPaymentSystem implements UPIPayment, CardPayment{

    Scanner sc = new Scanner(System.in);

    @Override
    public void processPayment() {
        System.out.println("Choose Payment Mode");
        System.out.println("Choice 1: UPI Payment");
        System.out.println("Choice 2: Card Payment");
        System.out.println("\nChoice: ");

        int ch = sc.nextInt();

        if(ch == 1){
            UPIPayment.super.processPayment();
        } else if (ch == 2){
            CardPayment.super.processPayment();
        } else {
            System.out.println("Invalid Choice");
        }
    }

}

public class DiamondProblem2 {
    public static void main(String[] args) {
        HybridPaymentSystem op = new HybridPaymentSystem();

        while(true){
            op.processPayment();
        }
    }
}
