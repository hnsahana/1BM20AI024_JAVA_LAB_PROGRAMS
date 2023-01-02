import java.util.Scanner;
class calculator
{
 public static void main(String[] args)
 {
   Scanner obj = new Scanner(System.in);
   int ch;
   int a,b;
   System.out.println("Calculator\n1. Addition of two numbers\n2. Substraction of two numbers\n3. Multiplication of two numbers\n4. Division of two numbers\n");
   System.out.println("\nEnter your choice");
   ch = obj.nextInt();
   System.out.println("Enter any two numbers ");
   a = obj.nextInt();
   b = obj.nextInt();

   switch(ch)
   {
    case 1: System.out.println("Sum of the numbers = "+(a+b));
            break;
    case 2: System.out.println("Difference of the numbers = "+(a-b));
            break;
    case 3: System.out.println("Product of the numbers = "+(a*b));
            break;
    case 4: float c;
            try
            {
              c = a/b;
              System.out.println("Division of the numbers = "+c);
            }
            catch(ArithmeticException e)
            {
              System.out.println("0 in the denominator");
            }
            catch(Exception e)
            {
              System.out.println("Exception");
            }
            break;
    default: System.out.println("Invalid choice"); 
   }
 }
}
