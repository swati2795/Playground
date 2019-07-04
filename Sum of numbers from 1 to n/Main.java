import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner x=new Scanner(System.in);
      int n=x.nextInt();
      int sum=0;
      for(int i=1;i<=n;i++)
        sum+=i;
      System.out.print(sum);
	}
}