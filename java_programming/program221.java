/*
   iRow = 4
   iCol = 4

     *
     * *
     * * * 
     * * * *
  


*/
import java.util.*;

class Pattern
{
  public void Display(int iRow,int iCol)
  {
    int i = 0,j = 0;

      if(iRow != iCol)                       //filter for diagonal pattern
     {
        System.out.println("Invalid parematers");
        System.out.println("No of Row and Colum Should Be Same");

        return;
     }
     
    for(i = 1;i <= iRow;i++)
    {
       for(j = 1;j <= iCol;j++)
       {
        if(i >= j)                     
        {
          System.out.print("*\t");
        }
      
      
        }
         System.out.println();
    }
  }
}
class program221
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0;
        int iValue2 = 0;

        System.out.println("Enter no of Rows :");
        iValue1 = sobj.nextInt();
       
        System.out.println("Enter no of Colum :");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1,iValue2);

    }
}