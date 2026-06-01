import java.util.*;

class DigitX
{
  public int SumEvenDigits(int iNo)
  {
   int iSum = 0;
   int iDigit = 0;

     while(iNo != 0)
    {
        iDigit = iNo % 10;

      if(iDigit % 2 == 0)
      {
        iSum = iSum + iDigit;
      }
        
        iNo = iNo/10;
        

    }
    return iSum;
   
  }
}
class program91
{
   public static void main(String A[])
   {
      Scanner sobj = new Scanner(System.in);
      DigitX dobj = new DigitX();
      int iValue = 0;
      int iRet = 0;
      System.out.println("Enter Number :");
      iValue = sobj.nextInt();
      iRet = dobj.SumEvenDigits(iValue);
      System.out.println(" Sumation of Digit is :"+iRet);

   }
}