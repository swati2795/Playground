import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner x=new Scanner(System.in);
      int n=x.nextInt();
      int sum=sum_num(n);
      System.out.print(sum);
	}
  
    public static int sum_num(int n)
    {
       int s=0;
       for(int i=1;i<=n;i++)
         s+=i;
       return s;
    }
}