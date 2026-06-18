//input = 7
// output = 
import java.util.*;

class program182
{    
    public static void Display(int iNo)
    {
        int iCnt = 0;
        char ch = '\0';
    
        for(iCnt = 1,ch = 'A';iCnt <= iNo;iCnt++,ch++)
        {
            if(iCnt%2 != 0)
          {
              System.out.print("\t"+ch);
          }
          else
          {
               System.out.print("\t"+iCnt);
          }
            
         }
        
         System.out.println();
    
    }
    public static void main (String A[])
    {
       Scanner sobj = new Scanner(System.in);
       int iValue = 0;

       System.out.println("Enter the No of ellement");
       iValue = sobj.nextInt();

       Display(iValue);
    }
}