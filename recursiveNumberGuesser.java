
import java.util.Scanner;

public class recursiveNumberGuesser {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] ukiyo) throws InterruptedException {
        // number 1 - 1000
        int min = 1;
        int max = 1000;
        System.out.println("Think of a number and let me guess it.");
        System.out.println(numberGuesser(min, max));
    }

    public static int numberGuesser(int min, int max) {
        int mid = (min + max) / 2;
        System.out.print("The number you're thinking is " + mid);
        System.out.print(" is it?\n[1]Yes!\n[2]It's lower\n[3]It's higher!\n: ");
        int answer = scan.nextInt();
        if (answer == 1) {
            System.out.print("Your number is: ");
            return mid;
        } else if (answer == 2) {
            return numberGuesser(min, mid);
        } else if(answer == 3) {
            return numberGuesser(mid, max);
        }else {
            System.out.print("N");
            return 0;
        }

    }
}
