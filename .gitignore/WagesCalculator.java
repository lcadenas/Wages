import java.util.Scanner;
import java.text.NumberFormat;

public class WagesCalculator
{
  public static void main (String[]args)
{
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the number of hours worked: ");
  int hours = input.nextInt();
  
  Scanner input1 = new Scanner(System.in);
  System.out.print("Enter the pay rate in your job: ");
  double rate = input1.nextDouble();
  
  Scanner input2 = new Scanner(System.in);
  System.out.print("Enter your tax deduction porcentage: ");
  double tax = input2.nextDouble()/100;
  
  final int STANDAR = 40;
  double income, pay;
  
  System.out.println();
  
  if(rate <= STANDAR)
      income = rate *hours;
  else
      income = (STANDAR * rate + (hours - STANDAR) * (rate * 1.5));
      
  pay = income - (income*tax);
  NumberFormat fmt = NumberFormat.getCurrencyInstance();
  System.out.println("Your weekly payment is " + fmt.format(pay));
}
}
