import java.util.Scanner;
public class Leafyear {
	public static void main(String[] args) {
	Scanner r = new Scanner(System.in);
	int s=r.nextInt();
	if(((s%4==0) && (s%100!=0))||(s%400==0)) {
		System.out.println(" It is a leap year");
	}
	else {
		System.out.println("Not a leap year");
	}
	}

}
