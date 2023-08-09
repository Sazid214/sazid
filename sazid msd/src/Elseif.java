import java.util.Scanner;
public class Elseif {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int g= k.nextInt();
		if(g<=35) {
			System.out.println("Better luck next time");
			System.out.println("You Fail");
		}
		else if ((g>35)&&(g<=45)) {
			System.out.println("Just passed");
			System.out.println("Your grade is C");
			
		}
		else if ((g>45)&&(g<70)) {
			System.out.println("You are passed");
			System.out.print("Your grade is B");
			
		}
		else if((g>=70)&&(g<=80)) {
			System.out.println("you are passed");
			System.out.println("your Grade is A");
			System.out.println("passed in distintion");
		}
	
	}

}
