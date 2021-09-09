import java.util.Scanner;
public class water {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many minutes do you take a shower ?");
		int minutes = sc.nextInt();
		sc.close();
		if (minutes <= 0 ) 
		{
			System.out.println("You don't take a shower!");	
		}	
		else 
		{
			int litres = minutes * 6;
			System.out.println("The amount of water you consume: " + litres + " litres of water." );
		}
		
			
	}

}
