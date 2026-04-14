import java.util.Random;
import java.util.Scanner;
public class numbergame {
    private static int totalScore=0;
    private static int roundsWon=0;
    private static final int Max_ATTEMPTS=5;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        boolean playAgain=true;
        int roundNumber=1;
        System.out.println("!!!!Welcome to NumberGame!!!!");
        System.out.println("***Guess(1-100)***");
        while(playAgain){
            System.out.println("\n---Round"+roundNumber+"---");
            int secretNumber=random.nextInt(100)+1;
            int attemptsLeft=MAX_ATTEMPTS;
            boolean guessedCorrectly=false;
            while(attemptsLeft>0){
                System.out.println("attemptsleft:"+attemptsLeft);
                System.out print("Enter your guess:");
                int guess;
                try{
                    guess=Integer.parseInt(Scanner.nextLine().trim());
                }catch(NumberFormateException e){
                System.out.println("!please Enter a valid Number");
                continue;
                }
                if(guess<1||guess>100){
                System.out.println("please Enter number between 1-100");
            continue;
                 }
                attemptsLeft--;
            if(guess==secretNumber){
                int pointsEarned=attemptsLeft*10+10;
                totalScore+=pointsEarned;
                roundsWon++;
                guessedCorrectly=true;
                System.out.println("!CORRECT!the number was"+secretNumber);
                System.out.println("your earned"+pointsEarned+"points!!");
                break;
            }else if(guess<secretNumber){
                System.out.println("Too Low!!Try little Higher!!");
            }else{
                System.out.println("Too High!!Try Little lower!!");
            }
        }
        if(!guessedCorrectly){
            System.out.println("out of attempts!!the number was"+secretNumber);
        }
        System.out.print("\n Score so far:"+totalScore+"RoundsWon"+roundWon+"/"+roundNumber);
        System.out.print("\n Play Another Round?(yes/No):");
        String response=scanner.nextLine().trim().toLowerCase();
        playAgain=response.equals("yes")||response.equals("y");
        roundNumber++;
    }
    System.out.println("!---GAME OVER---!");
    System.out.println("TotalRounds:"+(roundNumber-1)+"");
    System.out.println("RoundsWon:"+roundsWon+"");
    System.out.println("FinalScore:"+totalScore+"");
    System.out.println("Game Over Well Played!");
    scanner.close();
}
}
