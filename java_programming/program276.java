import java.util.*;

class program276
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String data;
        StringX strobj = new StringX();     //error
        int iRet = 0;

        System.out.println("Enter String :");
        data = sobj.nextLine();

        iRet = strobj.CountCapital(data);
        System.out.println("No of capital Character is : " + iRet);

        iRet = strobj.CountSmall(data);
        System.out.println("No of small Character is : " + iRet);

        iRet = strobj.CountDigits(data);
        System.out.println("No of Digits are : " + iRet);

        iRet = strobj.CountSpace(data);
        System.out.println("No of white Space are : " + iRet);

        iRet = strobj.CountSpecial(data);
        System.out.println("No of Special Symbols are : " + iRet);
    }
}