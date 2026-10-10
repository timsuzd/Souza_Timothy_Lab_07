import java.util.Random;
import java.util.Scanner;

public class GetLoopy_Task8 {
    void main()
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        String again = "Y";
        int die1 = 0;
        int die2 = 0;
        int die3 = 0;
        int sum = 0;
        int roll = 0;

        while(again.equalsIgnoreCase("Y"))
        {
            roll = 0;
            System.out.printf("%-10s %-10s %-10s %-10s %-10s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
            IO.println("--------------------------------------------------");

            do
            {
                die1 = rand.nextInt(6) + 1;
                die2 = rand.nextInt(6) + 1;
                die3 = rand.nextInt(6) + 1;
                sum = die1 + die2 + die3;
                roll++;

                System.out.printf("%-10d %-10d %-10d %-10d %-10d%n", roll, die1, die2, die3, sum);
            }
            while(die1 != die2 || die2 != die3);

            IO.println("You rolled a triple after " + roll + " throws!");
            IO.print("Would you like to play again? [Y/N]: ");
            again = in.nextLine();
        }
        IO.println("See you next time!");
    }
}
