import java.util.Scanner;
public class Forloop {

	public static void main(String[] args) {
 Scanner k=new Scanner (System.in);
 int sum=0;
 int l = k.nextInt();
 int d =k.nextInt();
 for(;l<=d;l++) {
	 sum=sum+l;	 
 }
 System.out.println(sum);

 k.close();
 

	}

}
