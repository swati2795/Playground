import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner x=new Scanner(System.in);
      int n=x.nextInt();
      int digit_count=0,n_modified=n;
      while(n_modified>0)
      {
         digit_count++;
         n_modified=n_modified/10;
      }
      int sum=0;
      n_modified=n;
      while(n_modified>0)
      {
         sum+=Math.pow(n_modified%10,digit_count);
         n_modified=n_modified/10;
      }
      if(sum==n)
        System.out.print("Armstrong Number");
      else
        System.out.print("Not a Armstrong Number");
	}
}