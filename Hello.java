/* authored by ian as a java beginner project 30/09/2024 */

import java.util.Scanner;
public class Hello
{
  double balance;
  
  public Hello(double balance){
    this.balance=balance;
    
  }

  public void checkbal(){
   System.out.println("your available balance is Ksh"+balance);
  }

  public void withdraw(Scanner scanner)
  {
    System.out.println("enter a valid amount to withdraw: ");
    double amount = scanner.nextDouble();
    if(amount < balance && amount>0)
      {
      balance-= amount;
      System.out.println("you have successfully withdrawn Ksh"+amount+"your current active balance is Ksh"+balance);
      }
      else if (amount> balance) {
        System.out.println("insufficient funds!");
      }
      else {
        System.out.println("please enter a valid amount!");
      }
  }
  public void deposit(Scanner scanner){
    System.out.println("please enter a valid amount to deposit: ");
    double amount = scanner.nextDouble();
    if (amount>0) {
      balance+=amount;
      System.out.println("you have successfully deposited Ksh"+amount+" your new balance is Ksh"+balance);
    }
    else{
      System.out.println("please enter a valid amount!");
    }

  }
  public static void main(String[] args){
    Hello bank= new Hello(1000.0);
    
    Scanner scanner= new Scanner(System.in);
    int choice = 0;
         System.out.println("                    ___________________________________________                            ");
         System.out.println("                   |   XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX |                           ");
         System.out.println("                   |   ____________________________________    |                           ");
         System.out.println("                   | X |         _^___________^____        | X |                           ");
         System.out.println("                   | X |       {###################}       | X |                           ");
         System.out.println("                   | X |      {##########.##########}      | X |                           ");
         System.out.println("                   | X |       {###{ * }####{ * }###}      | X |                           ");
         System.out.println("                   | X |         |######()#()######|       | X |                           ");
         System.out.println("                   | X |              |~----~|             | X |                           ");
         System.out.println("                   | X |                TTTT               | X |                           ");
         System.out.println("                   | x |               |____|              | X |                           ");
         System.out.println("                   | X |         JAVA BANK PROJECT         | X |                           ");
         System.out.println("                   | X |___________________________________| X |                           ");
         System.out.println("                   | X XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX X |                           ");
         System.out.println("                   |___________________________________________|                           ");

    
    while(choice != 4){
      

      

        System.out.println("        ################################################################");
        System.out.println("                              welcome to our bank                        ");
        System.out.println("        ################################################################");
        System.out.println("          please select a number that corresponds with servise needed   ");
        System.out.println("                           1: check bank balance");
        System.out.println("                           2: withdraw money");
        System.out.println("                           3: deposit money");
        System.out.println("                           4: exit");
    choice= scanner.nextInt();
      switch(choice){
        case 1:
          bank.checkbal();
          break;
        case 2:
          bank.withdraw(scanner);
          break;
        case 3:
          bank.deposit(scanner);
          break;
        case 4:
          System.out.println("thank you for visiting. exiting........");
          break;
        default:
          System.out.println("invalid choice");
      }
    }
    scanner.close();

  }
}
