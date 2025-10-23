import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here
    //Problem 1:
    for (int count = 1; count <= 25; count += 2)
    {
      System.out.println(count);
    }
    //Problem 2:
    for (int wawa = 17; wawa <= 73; wawa++)
    {
      System.out.print(wawa + " ");
      if (wawa % 10 == 6)
      {
        System.out.println();
        }
    }
    //Problem 3:
    Scanner sc = new Scanner(System.in);
    int baubau;
    System.out.println("Enter a number between 0 and 50:");
    baubau = sc.nextInt();
    if (!(0 <= baubau && baubau <= 50))
    {
      System.out.println("error");
    }
    else
    {
      for (int konkon = baubau; konkon <= 50; konkon++)
      {
        System.out.print(konkon + " ");
        if (konkon % 5 == (baubau + 4) % 5)
        {
          System.out.println();
        }
      }
    }
    //Problem 4:
    
  }
}  
