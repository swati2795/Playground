import java.util.*;
class Main
{
   public static void main(String v[])
   {
      Scanner x=new Scanner(System.in);
      int n=x.nextInt();
      String s=""+n;
      int n_second=Integer.parseInt(s.charAt(1)+"");
     System.out.print(n_second);
   }
}