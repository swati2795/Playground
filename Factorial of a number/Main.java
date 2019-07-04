import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner x=new Scanner(System.in);
      int n=x.nextInt();
      int factorial=1;
      for(int i=1;i<=n;i++)
        factorial=factorial*i;
      System.out.print(factorial);
	}
}