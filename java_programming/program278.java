import java.util.*;

class StringX
{
   public String update(String str)
   {
    char Arr[] = str.toCharArray();
    int i = 0;

    for(i = 0;i < Arr.length;i++)
    {
        if(Arr[i] == 'A' || Arr[i] == 'a')
        {
            Arr[i] = ' ';
        }
    }
    String ret = new String(Arr);
    return ret;
   }
}


class program278
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String data;
        StringX strobj = new StringX();
        String sRet = null;
        

        System.out.println("Enter String :");
        data = sobj.nextLine();

        sRet = update(data);
        System.out.println("Updayed String is :"+sRet);

       
    }
}