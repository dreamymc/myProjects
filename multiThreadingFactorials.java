
import java.util.Scanner;

class Multithreadthing implements Runnable {

    private int factorialNumber;
    public Multithreadthing(int threadNumber) {
        this.factorialNumber = threadNumber;
    }
    @Override
    public void run() throws IllegalArgumentException {
        int error = 0;
        try {
            if (factorialNumber < 0) {
                error = factorialNumber;
                throw new IllegalArgumentException("Factorial is undefined for negative numbers.");
            } else { //multithreading calculation
                int current = 1;
                for (int x = 1; x <= factorialNumber; x++) {
                    current = (current * x);
                }
                System.out.printf("Factorial of %d is %d\n", factorialNumber, current);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught at input " + error + ": " + e);
        }
    }

}

public class multiThreadingFactorials {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many factorials do you wish to perform: ");
        int limit = scan.nextInt();
        int[] array = new int[limit];
        for (int x = 0; x < array.length; x++) {
            System.out.print("Enter the number: ");
            int input = scan.nextInt();
            array[x] = input;
        }
        System.out.println("");
        for (int y = 0; y < array.length; y++) {
            Multithreadthing mainThread = new Multithreadthing(array[y]);
            Thread mt = new Thread(mainThread);
            mt.start();
        }

    }

}
