import java.util.Scanner;
class GuessNum
{
	public static void main(String args[])
	{		
		Scanner sc= new Scanner(System.in);
		int my_num=(int)(Math.random()*100);
		int user_num=0;
		int attempts=0;
		int max_attempts=6;
		boolean guessedCorrectly = false;
		System.out.println("Welcome to number guessing game!");
		do{
			if(attempts==max_attempts)
			{
				System.out.println("You have reached maximum attempts!!");
				break;
			}
			System.out.print("Guess my number(1-100):");
			user_num= sc.nextInt();
			attempts++;
			
			if(user_num==my_num)
			{
				System.out.println("Congratulations, You Won!!");
				System.out.printf("You guessed this number in %d attempts\n",attempts);
				guessedCorrectly = true;
				break;
			}
			else if(user_num>my_num){
				System.out.println("Oops!!, Your number is too large...\n Try Again...");
				
			}
			else
			{
				System.out.println("Oops!!, Your number is too small...\n Try Again...");
				
			}
		
		}
		while(user_num>=0);
		System.out.print("My number was: ");
		System.out.println(my_num);
		
		System.out.print("Do you want to play again? (yes/no): ");
		String playAgain = sc.next();
		if(playAgain.equalsIgnoreCase("yes"))
		{
			main(args);
		}
		else
		{
			System.out.println("Thank you for playing!");
		}
	}
}
		
		