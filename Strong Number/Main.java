import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner x=new Scanner(System.in);
      int n=x.nextInt();
      int sum=0,n_modified=n;
      while(n_modified>0)
      {
        int r=n_modified%10,fact=1;
        for(int i=1;i<=r;i++)
          fact=fact*i;
         sum+=fact;
        n_modified=n_modified/10;
      }
      if(n==sum)
        System.out.print("Yes");
      else
        System.out.print("No");
	}
}