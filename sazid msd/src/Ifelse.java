import java.util.Scanner;
public class Ifelse {
	public static void main(String[] args) {
	Scanner k =new Scanner (System.in);
	int s=k.nextInt();
	if (s>=18) {
		System.out.println("you are allow to room");
	}
	else {
		System.out.println("Not allow to room");
	}
	k.close();
	}

}
