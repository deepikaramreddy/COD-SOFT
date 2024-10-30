import java.util.Scanner;
import java.util.Random;
public class NumberGame{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int maxRounds=3;
        int score=0;
        System.out.println("Welcome to the number guessing game");
        System.out.println("you have only 5 attempts to guess the number in each round");
        for(int round=1;round<=maxRounds;round++){
            int randomNumber=random.nextInt(100)+1;
            int attempts=5;
            boolean won=false;
            System.out.println("\nRound" +round+":Guess a number between 1 and 100");
            while(attempts>0){
                System.out.print("Enter your guess:");
                int guess=scanner.nextInt();
                attempts--;
                if(guess==randomNumber){
                    System.out.println("Congratulations! You guessed the correct number");
                    score++;
                    won=true;
                    break;
                }
                else if (guess<randomNumber){
                    System.out.println("Too low ,Try again");
                }
                else{
                    System.out.println("Too high,Try again");
                }
                System.out.println("Attempts left:"+attempts);

            }
            if(!won){
                System.out.println("Sorry! The correct number was"+randomNumber);
            }
            System.out.println("Your score after Round" +round+ ":"+score);
            if(round<maxRounds){
                System.out.println("Do you want to play the next round? (yes/no):");
                String playAgain=scanner.next();
                if(!playAgain.equalsIgnoreCase("yes")){
                    break;
                }
            }
        }
        System.out.println("\nGame Over! Your final score is:" +score);
        scanner.close();

    }
}