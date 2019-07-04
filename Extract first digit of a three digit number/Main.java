import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner x=new Scanner(System.in);
      int n=x.nextInt();
      int n_firstdigit=n/100;
      System.out.println(n_firstdigit);
	}
}