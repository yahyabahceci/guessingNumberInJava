package guessingNumberInJava;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InterruptedException{
		Scanner scanner = new Scanner(System.in);
		
		int min = 1;
		int mid = 512;
		int max = 1024;
		
		System.out.print("G");
		Thread.sleep(100);
		System.out.print("u");
		Thread.sleep(100);
		System.out.print("e");
		Thread.sleep(100);
		System.out.print("s");
		Thread.sleep(100);
		System.out.print("s");
		Thread.sleep(100);
		System.out.print("i");
		Thread.sleep(100);
		System.out.print("n");
		Thread.sleep(100);
		System.out.print("g");
		Thread.sleep(100);
		System.out.print(" ");
		System.out.print("N");
		Thread.sleep(100);
		System.out.print("u");
		Thread.sleep(100);
		System.out.print("m");
		Thread.sleep(100);
		System.out.print("b");
		Thread.sleep(100);
		System.out.print("e");
		Thread.sleep(100);
		System.out.print("r");
		Thread.sleep(100);
		System.out.println(" ");
		System.out.println("----------------------");
		Thread.sleep(1000);
		System.out.println("Please guess a number which should be between 1 and 1024");
		Thread.sleep(1000);
		System.out.println("I need your help to guess your number. Therfore, when i ask question, you just say L(Less) G(Greater) or F(Finded).");
		Thread.sleep(1000);
		System.out.println("Are you ready? ");
		String ready = scanner.nextLine();
		
		if(ready.equalsIgnoreCase("yes")) {
			System.out.println("Is your number grater or less than " + 512 + " or this number is true number.");
			String answer = scanner.nextLine();
			if(answer.equalsIgnoreCase("F")) {
				System.out.println("I find your number is " + mid);
				System.exit(0);
			}
			else if(answer.equalsIgnoreCase("G")) {
				min = mid + 1;
				mid = mid + ((max - mid) / 2);
			}
			else if(answer.equalsIgnoreCase("L")) {
				max = mid - 1;
				mid = min + (max - min) / 2;
			}
			
			System.out.println("Is your number grater or less than " + mid + " or this number is true number.");
			String answer2 = scanner.nextLine();
			if(answer2.equalsIgnoreCase("F")) {
				System.out.println("I find your number is " + mid);
				System.exit(0);
			}
			else if(answer2.equalsIgnoreCase("G")) {
				min = mid + 1;
				mid = mid + ((max - mid) / 2);
			}
			else if(answer2.equalsIgnoreCase("L")) {
				max = mid - 1;
				mid = min + (max - min) / 2;
			}
			
			System.out.println("Is your number grater or less than " + mid + " or this number is true number.");
			String answer3 = scanner.nextLine();
			if(answer3.equalsIgnoreCase("F")) {
				System.out.println("I find your number is " + mid);
				System.exit(0);
			}
			else if(answer3.equalsIgnoreCase("G")) {
				min = mid + 1;
				mid = mid + ((max - mid) / 2);
			}
			else if(answer3.equalsIgnoreCase("L")) {
				max = mid - 1;
				mid = min + (max - min) / 2;
			}
			
			System.out.println("Is your number grater or less than " + mid + " or this number is true number.");
			String answer4 = scanner.nextLine();
			if(answer4.equalsIgnoreCase("F")) {
				System.out.println("I find your number is " + mid);
				System.exit(0);
			}
			else if(answer4.equalsIgnoreCase("G")) {
				min = mid + 1;
				mid = mid + ((max - mid) / 2);
			}
			else if(answer4.equalsIgnoreCase("L")) {
				max = mid - 1;
				mid = min + (max - min) / 2;
			}
			
			System.out.println("Is your number grater or less than " + mid + " or this number is true number.");
			String answer5 = scanner.nextLine();
			if(answer5.equalsIgnoreCase("F")) {
				System.out.println("I find your number is " + mid);
				System.exit(0);
			}
			else if(answer5.equalsIgnoreCase("G")) {
				min = mid + 1;
				mid = mid + ((max - mid) / 2);
			}
			else if(answer5.equalsIgnoreCase("L")) {
				max = mid - 1;
				mid = min + (max - min) / 2;
			}
			
			System.out.println("Is your number grater or less than " + mid + " or this number is true number.");
			String answer6 = scanner.nextLine();
			if(answer6.equalsIgnoreCase("F")) {
				System.out.println("I find your number is " + mid);
				System.exit(0);
			}
			else if(answer6.equalsIgnoreCase("G")) {
				min = mid + 1;
				mid = mid + ((max - mid) / 2);
			}
			else if(answer6.equalsIgnoreCase("L")) {
				max = mid - 1;
				mid = min + (max - min) / 2;
			}
			
			System.out.println("Is your number grater or less than " + mid + " or this number is true number.");
			String answer7 = scanner.nextLine();
			if(answer7.equalsIgnoreCase("F")) {
				System.out.println("I find your number is " + mid);
				System.exit(0);
			}
			else if(answer7.equalsIgnoreCase("G")) {
				min = mid + 1;
				mid = mid + ((max - mid) / 2);
			}
			else if(answer7.equalsIgnoreCase("L")) {
				max = mid - 1;
				mid = min + (max - min) / 2;
			}
			
			System.out.println("Is your number grater or less than " + mid + " or this number is true number.");
			String answer8 = scanner.nextLine();
			if(answer8.equalsIgnoreCase("F")) {
				System.out.println("I find your number is " + mid);
				System.exit(0);
			}
			else if(answer8.equalsIgnoreCase("G")) {
				min = mid + 1;
				mid = mid + ((max - mid) / 2);
			}
			else if(answer8.equalsIgnoreCase("L")) {
				max = mid - 1;
				mid = min + (max - min) / 2;
			}
			
			System.out.println("Is your number grater or less than " + mid + " or this number is true number.");
			String answer9 = scanner.nextLine();
			if(answer9.equalsIgnoreCase("F")) {
				System.out.println("I find your number is " + mid);
				System.exit(0);
			}
			else if(answer9.equalsIgnoreCase("G")) {
				min = mid + 1;
				mid = mid + ((max - mid) / 2);
			}
			else if(answer9.equalsIgnoreCase("L")) {
				max = mid - 1;
				mid = min + (max - min) / 2;
			}
			
			System.out.println("Is your number grater or less than " + mid + " or this number is true number.");
			String answer10 = scanner.nextLine();
			if(answer10.equalsIgnoreCase("F")) {
				System.out.println("I find your number is " + mid);
				System.exit(0);
			}
			else if(answer10.equalsIgnoreCase("G")) {
				min = mid + 1;
				mid = mid + ((max - mid) / 2);
			}
			else if(answer10.equalsIgnoreCase("L")) {
				max = mid - 1;
				mid = min + (max - min) / 2;
			}
			
			if(min == max) {
				System.out.println("I find your number is " + max);
			}
			
			
			
		}
		else if(ready.equalsIgnoreCase("no")) {
			System.out.println("OK, bay bay");
		}
			
		scanner.close();
	
	}
}
