import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner x=new Scanner(System.in);
    int n=x.nextInt();
    int n_firstdigit=n/100;
    int n_seconddigit=(n/10)%10;
    int n_lastdigit=n%10;
    int reverse=(n_lastdigit*100)+(n_seconddigit*10)+n_firstdigit;
    System.out.println(reverse);
  }
}