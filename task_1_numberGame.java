package internship_tasks;
import java.util.Random;
import java.util.Scanner;

class Number_guessing_game{
    public int num;
    public int inputNum;
    public int guess = 0;

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    Number_guessing_game(){
        Random random = new Random();
        this.num = random.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number between 1-100");
        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();
    }

    boolean isCorrect(){
        guess++;
        if (inputNum == num){
            System.out.format("Win!! You guessed it correct, it was %d \n guessed in %d attempts", num, guess);
            return true;
        }
        else if (inputNum > num){
            System.out.println("Nope!! Too High..");
        }
        else if (inputNum < num){
            System.out.println("Nope!! Too Low..");
        }
        return false;
    }
}

public class task_1_numberGame {

    public static void main(String[] args){
        Number_guessing_game game = new Number_guessing_game();
        boolean bool = false;
        while(!bool){
            game.takeUserInput();
            bool = game.isCorrect();
        }

    }
}
