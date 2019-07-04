import java.util.Scanner;
class Main
{
   public static void main(String v[])
   {
      Scanner x=new Scanner(System.in);
      int base=x.nextInt();
      int exponent=x.nextInt();
      power(base,exponent);
   }
  
   public static void power(int b,int e)
   {
      int pow=1;
      for(int i=1;i<=e;i++)
        pow=pow*b;
      System.out.print(pow);
   }
}