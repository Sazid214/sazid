import java.util.Scanner;

public class Forloops {
	public static void main(String[] args) {
		Scanner h= new Scanner(System.in);
		String s = h.nextLine();
		String rw="";
		for (int j=0;j<=s.length()-1;j++) {
			rw = s.charAt(j)+rw;
			System.out.println(rw);
		}
		if(s.equals(rw) ){
			System.out.println("palindrome");
			

		}
	}

}
