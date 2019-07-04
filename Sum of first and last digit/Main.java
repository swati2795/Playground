import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner x=new Scanner(System.in);
      int n=x.nextInt();
      String s=""+n;
      int n_first=Integer.parseInt(s.charAt(0)+"");
      int n_last=Integer.parseInt(s.charAt(s.length()-1)+"");
      int sum=n_first+n_last;
      System.out.println(sum);
	}
}