import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner x=new Scanner(System.in);
      int n=x.nextInt();
      int n_firstdigit=n/100;
      int n_lastdigit=n%10;
      int sum=n_firstdigit+n_lastdigit;
      System.out.println(sum);
	}
}