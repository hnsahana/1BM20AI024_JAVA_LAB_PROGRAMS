import java.util.Scanner;
class arrayn
{
  public static void main(String[] args)
  {
    Scanner obj = new Scanner(System.in);
    int n;
    int[] a = new int[10];
    System.out.println("Enter the size of an array ");
    n = obj.nextInt();
    int i;
    System.out.println("Enter the array elements ");
    for(i=0;i<n;i++)
    {
      a[i] = obj.nextInt();
    } 
    System.out.println("Array elements are ");
    for(i=0;i<n;i++)
    {
      System.out.println(a[i]);
    }
    System.out.println("Enter the index of an element to be displayed ");
    int ch = obj.nextInt();
    try
    {
      System.out.print("The element at index " +ch+ " is "+(a[ch+1]));
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("Array out of bound");
    }
    catch(Exception e)
    {
      System.out.println("Exception");
    }
  }
}