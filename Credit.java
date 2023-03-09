import java.util.Scanner;

public class Credit{
  public static main void(String[] args){
    Scanner in = new Scanner(System.in);
    
    int maxCredit;
    int usedCredit;
    
    System.out.println("Enter the maximum amount of available credit: ");
    maxCredit = in.nextInt();
    System.out.println("Enter the amount of used credit: ");
    usedCredit = in.nextInt();
    
    int availableCredit = maxCredit - usedCredit;
    
    System.out.println("Your current available credit is:" + availableCredit);
    
  }
}
