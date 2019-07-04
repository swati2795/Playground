import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner x=new Scanner(System.in);
      int n=x.nextInt();
      int n_secondlastdigit=(n/10)%10;
      System.out.println(n_secondlastdigit);
	}
}