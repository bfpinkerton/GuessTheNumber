import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        game();
    }

    private static void game(){
        System.out.println("Hello! What is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Well, "+name+", I am thinking of a number between 1 and 20");
        System.out.println("Take a guess.");

        int tries = 0;
        boolean status = false;
        Random rand = new Random();
        int int_random = rand.nextInt(20);
        while((status == false)&&(tries<6)){
            tries++;
            String guess = sc.nextLine();
            if(Integer.parseInt(guess) == int_random){
                System.out.println("Good job, "+name+"! You guessed my number in "+tries+" guesses!");
                System.out.println("Would you like to play again? (y or n");
                String answer = sc.nextLine();
                if(answer == "y"){
                    game();
                }
                else{
                    status = true;
                }
            }
            else if(Integer.parseInt(guess) < int_random){
                System.out.println("Your guess is too low.");
                System.out.println("Take a guess.");
            }
            else{
                System.out.println("Your guess is too high.");
                System.out.println("Take a guess.");
            }
        }
    }
}