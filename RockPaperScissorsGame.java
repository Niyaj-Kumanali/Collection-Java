package Collection;

import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char computerHand, userHand;

        while (true)
        {
            int t = (int) (Math.random() * 100); //will generate new choice for each iteration
            computerHand = getComputerHand(t);

            System.out.println("\nEnter \n\t'r' for rock \n\t'p' for paper \n\t's' for scissors and \n\t'e' for exit ");
            System.out.print("Enter your choice :  ");
            userHand = sc.next().charAt(0);

            if (userHand == 'e') {
                System.out.println("\n**********Thank you for playing**********");
                break;
            }

            int result = gameResult(computerHand, userHand);


            switch (result)
            {
                case 1 :
                    System.out.println("\n\t\t********** You Won **********");
                    break;
                case -1 :
                    System.out.println("\n\t\t********** You Lose **********");
                    break;
                case 0 :
                    System.out.println("\n\t\t********** It's Draw **********");
                    break;
                default:
                    System.out.println("\n!!!!!!! Enter a valid choice !!!!!!!");
            }
        }
    }

    private static char getComputerHand(int t) {
        char computerHand;
        if(t <33)
            computerHand = 'r';
        else if(t >33 && t <66)
            computerHand = 'p';
        else
            computerHand = 's';
        return computerHand;
    }

    public static int gameResult(char c, char y)
    {
        if(c == y)
            return 0;
        if((c == 'r' && y == 's') || (c == 'p' && y == 'r') || (c == 's' && y == 'p'))
            return -1;
        if((y == 'r' && c == 's') || (y == 'p' && c == 'r') || (y == 's' && c == 'p'))
            return 1;
        return 2;
    }
}
