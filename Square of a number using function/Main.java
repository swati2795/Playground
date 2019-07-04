import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here 
      Scanner x=new Scanner(System.in);
      int n=x.nextInt();
      int sq=square(n);
      System.out.print(sq);
	} 
  
    public static int square(int n)
    {
       return n*n;
    }
}