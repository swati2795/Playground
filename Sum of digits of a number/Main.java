import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner x=new Scanner(System.in);
      int n=x.nextInt();
      int sum=0;
      while(n>0)
      {
         sum=sum+n%10;
        n=n/10;
      }
      System.out.print(sum);
	}
}