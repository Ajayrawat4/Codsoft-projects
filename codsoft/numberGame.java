import java.util.Scanner;

public class numberGame {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int chances = 5; // Set the number of chances
    int finals = 0;
    boolean playAgain = true;
    
    System.out.println("Welcome to Codsoft");
    System.out.println("You have " + chances + " chances to win the game.");
    
    while (playAgain) {
        int rand = getRandN(1, 100);
        boolean guess = false;
        
        for (int i = 0; i < chances; i++) {
            System.out.println("Chance " + (i + 1) + ": Enter your guess:");
            int user = sc.nextInt();
            
            if (user == rand) {
                guess = true;
                finals += 1;
                System.out.println("You won it!");
                break;
            } else if (user > rand) {
                System.out.println("Too high");
            } else {
                System.out.println("Too low");
            }
        }
        
        if (!guess) {
            System.out.println("Sorry, you lost. The number was " + rand);
        }
        
        System.out.println("Do you want to play again? (y/n)");
        String pa = sc.next();
        playAgain = pa.equalsIgnoreCase("y");
    }
    
    System.out.println("That's it, buddy. Hope you enjoyed it.");
    System.out.println("Here's your score: " + finals);
  }
  
  public static int getRandN(int min, int max) {
    return (int)(Math.random() * (max - min + 1) + min);
  }
}
