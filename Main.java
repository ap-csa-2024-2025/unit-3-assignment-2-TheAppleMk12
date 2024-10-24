import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here
    //Problem 1
    Scanner sc = new Scanner(System.in);
    double x = 12.345;

    System.out.println("Please enter a double:");
    double y = sc.nextDouble();

    if (x==y){
      System.out.print("YES\n");
    }
    int a = 48;

    System.out.println("Please enter an integer:");
    int b = sc.nextInt();

    if (a==b){
      System.out.print("YES\n");
  }
  }
}
