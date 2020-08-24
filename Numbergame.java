import java.util.Scanner;
public class Numbergame {

	public static void main(String[] args) {
		int randomNumber = (int) (Math.random() * 100) + 1;
		boolean haswon = false;
		System.out.println("I have randomly choosen a number between 1 and 100.");
		System.out.println("Try to guess it! ");
		Scanner scanner = new Scanner(System.in);
		for (int i=10;i>0;i--) {
			System.out.println("You have " + i + " guess(es) left. Choose again: ");
			int guess = scanner.nextInt();
			
			if (randomNumber < guess) {
				System.out.println("The number is smaller than " + guess);
			}
			else if(randomNumber > guess) {
				System.out.println("The number is greater than " + guess);
				
			}
			else {
				haswon = true;
				break;
			}
		}	 
			if(haswon){
				System.out.println("Coreect you win!");}
			else {
				System.out.println("Game over");
				System.out.println("The number was : " + randomNumber);
			}
		}
	}
		

