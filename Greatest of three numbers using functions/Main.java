import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner x=new Scanner(System.in);
      int n1=x.nextInt();
      int n2=x.nextInt();
      int n3=x.nextInt();
      int r1=greater(n1,n2);
      System.out.print(greater(r1,n3));
	}
  
    public static int greater(int x, int y)
    {
       return x>y?x:y;
    }
}