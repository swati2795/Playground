import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner x=new Scanner(System.in);
      int n1=x.nextInt();
      int n2=x.nextInt();
      int n3=x.nextInt();
      if(n1>n2)
      {
      	if(n1>n3)
          System.out.println(n1);
        else
          System.out.println(n3);
      }
      else
      {
      	if(n2>n3)
          System.out.println(n2);
        else
          System.out.println(n3);
      }
    }
}