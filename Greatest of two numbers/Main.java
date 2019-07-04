import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner x=new Scanner(System.in);
      int num1=x.nextInt();
      int num2=x.nextInt();
      if(num1>num2)
        System.out.println("num1 is the greatest number");
      else if(num1<num2)
        System.out.println("num2 is the greatest number");
      else
        System.out.println("both are equal");
	}
}