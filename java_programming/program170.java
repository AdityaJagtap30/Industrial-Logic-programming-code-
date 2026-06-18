import java.util.Scanner;

class ArrayX
{
    private int Arr[];
    private int iSize;

    // Parameterized constructor with default behavior
    public ArrayX(int X)
    {
        iSize = X;
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements:");

        for(int iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Elements of Array are:");

        for(int iCnt = 0; iCnt < iSize; iCnt++)
        {
            System.out.print(Arr[iCnt] + "\t");
        }
        System.out.println();
    }

    public int Summation()
    {
        int iSum = 0;

        for(int iCnt = 0; iCnt < iSize; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }

        return iSum;
    }
}

class program170
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int iLength = 0;
        int iRet = 0;

        System.out.print("Enter the number of elements: ");
        iLength = sobj.nextInt();

        ArrayX aobj = new ArrayX(iLength);

        aobj.Accept();
        aobj.Display();

        iRet = aobj.Summation();

        System.out.println("Summation is: " + iRet);

        sobj.close();
    }
}