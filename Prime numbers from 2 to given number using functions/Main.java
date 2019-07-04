import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner x=new Scanner(System.in);
      int n=x.nextInt();
      showPrime(n);
	}
  
    public static void showPrime(int n)
    {
       for(int i=2;i<=n;i++)
       {
          if(i==2)
          {
             System.out.println(i);
          }
          else
          {
              boolean prime=true;
              for(int j=2;j<=i/2;j++)
              {
                  if(i%j==0)
                    prime=false;
              }
              if(prime)
                System.out.println(i);
          }
       }
    }
}