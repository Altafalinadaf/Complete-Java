package Games;
import java.util.Random;
import java.util.Scanner;


/*Create a class Game,which allows a user to play "Guess the number"
game once. game should have the following methods :

1.Constructor to generate the random number 
2.takeUserInput() to take a user input of number
3.isCorrectNumber() to detect whether the number entered by the user is True
4.getter and setter for noOfGuesses
*/

class numberGame{
	private int randomNumber;
	private int guess;
	private int numAttempts;
	private boolean isGameOver;
	
	// this is the constructor here we initialize the values
	public numberGame() {
		Random random=new Random();
		randomNumber=random.nextInt(100)+1;
		guess=0;
		numAttempts=0;
		isGameOver=false;
		
		//System.out.print(randomNumber);
	}
	// taking here user inputs 
	 private void readInput() {
	    	@SuppressWarnings("resource")//this line for scanner its not a part of program
			Scanner sc=new Scanner(System.in);
	    	guess=sc.nextInt();  
	    	
	    }
	 
	 
	 // checking the both conditions userInput and ComputerInput
	 public void checkGuess() {
		  // 2<1 0 2>100 0 0
	    	if(guess<1 || guess>100) {
	    		System.out.println("Invalid Guess.");
	    		System.out.print("Please Enter the number between 0 to 100.");
	    	}
	    	
	    	//2<40
	    	else if (guess<randomNumber) {
	    		System.out.println("To low! Guess again:");
	    		System.out.print("Enter the number again : ");
				
			}
	    	//50>40
	    	else if (guess>randomNumber) {
	    		System.out.println("To high! Guess again:");
	    		System.out.print("Enter the number again : ");
				
			}
	    	// 40 == 40;
	    	else {
	    		System.out.println("Congratulations, you guessed the number!");
	    		isGameOver=true;
	    	}
	    	
	 }
	 
	 
	// our program starts with here  
	public void play() {
		System.out.print("Guess the number between 0 to 100 : ");
		while(!isGameOver) {
			readInput();
			checkGuess();
			// it is increments the number of attempts 
			numAttempts++;
			
		}
		System.out.println("Game over! You took "+numAttempts+" attempts. ");
		System.out.println("The Random Number is : "+randomNumber);
	}  
	
	
}
public class Random_Guess_Number_game {
	public static void main(String[] args) {
		numberGame game=new numberGame();
		game.play();
		
	}
}
