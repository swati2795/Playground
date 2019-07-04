import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner x=new Scanner(System.in);
      int n1=x.nextInt();
      int n2=x.nextInt();
      int n3=x.nextInt();
      int r=find_gcd(n1,n2);
      System.out.print(find_gcd(r,n3));
	}
  
    public static int find_gcd(int x,int y)
    {
       int min_element=0,gcd=0;
       min_element=x<y?x:y;
       while(min_element>0)
       {
          if(x%min_element==0 && y%min_element==0)
          {
             gcd=min_element;
             break;
          }
          min_element--;
       }
       return gcd;
    }
}