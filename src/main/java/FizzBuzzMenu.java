import java.util.Scanner;

public class FizzBuzzMenu {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        
        while (running == true);
        {
            // output menu of choices for user
            System.out.println("--- FizzBuzz Menu ---");
            System.out.println("1. Fizz (Multiples of 3)");
            System.out.println("2. Buzz (Multiples of 5)");
            System.out.println("3. FizzBuzz (Multiples of 3 and 5)");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");

            int choice = sc.nextInt();

            // switch cases
            switch(choice)
            {
                case 1:
                    for (int j=0; j<100; j++) {
                        if (j%3==0) {
                            System.out.print(j + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 2:
                    for (int j=0; j<100; j++) {
                        if (j%5==0) {
                            System.out.print(j + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 3:
                    for (int j=0; j<100; j++) {
                        if (j%3==0 && j%5==0) {
                            System.out.print(j + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    running = false;
                    System.out.println("Goodbye");
                    break;
                    // bro what is going on why is it taking this long
            }
        }
    }
}
