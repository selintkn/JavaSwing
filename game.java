import java.util.Random;
import java.util.Scanner;
public class game {
public static void main(String[]args) {
	
	
	Random Rnumber = new Random();
	Scanner scanner = new Scanner(System.in);
	
	
	int attempts=0;
	int guess;
	int randomNum = Rnumber.nextInt(0,101);
	
	System.out.println("Welcome to the number guessing game");
	System.out.println("Guess a number between 0 and 100");
	
	
	do {
		System.out.println("enter your guess");
		guess = scanner.nextInt();
		attempts++;
		
		if(guess < randomNum) {
			System.out.println("too low, try again.");
		}
		else if(guess > randomNum) {
			System.out.println("too high, try again.");
		}
		else {
			System.out.println("YES! the number was" + randomNum);
			System.out.println("you guessed in "+ attempts+" attempts");
			
		}
		
		
	}while(guess != randomNum);
	System.out.println("you won !");
}
}
