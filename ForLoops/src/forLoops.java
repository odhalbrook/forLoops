import java.util.Scanner;

public class forLoops
	{

		public static void main(String[] args)
			{
				showChallenge1();
				showChallenge2();
				showChallenge3();
				showChallenge4();
				showChallenge5();
				showChallenge6();

			}

		private static void showChallenge1()
			{
				for(int i = 1; i<6; i++)
					{
						System.out.println(i);
					}
				
			}

		private static void showChallenge2()
			{
				for(int i = 2; i<=10; i=i+2)
					{
						System.out.println(i + " I Love Mullen!");
					}
				
			}

		private static void showChallenge3()
			{
				for(int i = 1; i<=5; i++)
					{
						System.out.print(i + " ");
					}
				System.out.println(" ");
			}

		private static void showChallenge4()
			{
				for(int i = 10; i>=1; i--)
					{
						System.out.println(i);
					}
				
					System.out.println("Liftoff");
			
			}
		private static void showChallenge5()
			{
				
				for(int i=0;i<10; i++)
					{
						int random = (int) (Math.random() * 100) + 1;
						System.out.println(random);
					}
				
			}
		
		private static void showChallenge6()
		{
			
			Scanner userInput = new Scanner(System.in);
			System.out.println("What is your name?");
			String name = userInput.nextLine();
			System.out.println("Cool, nice to meet you, " + name + "!");
			
			System.out.println(name + ", how many time would you like me to flip a coin?");
			int number = userInput.nextInt();
			
			int headsCounter = 0;
			int tailsCounter = 0;
			for(int i=0;i<number;i++)
				{
					
					int random = (int) (Math.random() * 2) + 1;
					
					if(random == 1)
						{
							headsCounter++;
						}

					else if(random == 2)
						{
							tailsCounter++;
						}
			
				}
			System.out.println("You flipped " + headsCounter + " heads");
			System.out.println("You flipped " + tailsCounter + " tails");
		}
		
	
			
		
	}
