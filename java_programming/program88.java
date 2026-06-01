import java.util.*;

class DigitX
{
  public void CountEvenOddDigits(int iNo)
  {
   int iCountEven = 0, iCountOdd = 0;
   int iDigit = 0;

     while(iNo != 0)
    {
        iDigit = iNo % 10;
        if(iDigit % 2 != 0)
        {
        iCountOdd++;
        }
        else(iDigit % 2 == 0)
        {
          iCountEven++;  
        }
        iNo = iNo/10;
        

    }
    System.out.println("Even number Digit are"+iCountEven);
    System.out.println("Odd number Digit are"+iCountOdd); 
   
   
  }
}
class program88
{
   public static void main(String A[])
   {
      Scanner sobj = new Scanner(System.in);
      DigitX dobj = new DigitX();
      int iValue = 0;
      System.out.println("Enter Number :");
      iValue = sobj.nextInt();
      dobj.CountEvenOddDigits(iValue);
    

   }
}