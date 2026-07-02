package Marvellous;
public class StringX                         // user Define class
{
    public int CountCapital(String str)
    {
        int iCount = 0;
        char Arr[] = str.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'A' && Arr[i] <= 'Z')
            {
                iCount++;
            }
        }
        return iCount;
    }

    public int CountSmall(String str)
    {
        int iCount = 0;
        char Arr[] = str.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                iCount++;
            }
        }
        return iCount;
    }

  public int CountDigits(String str)
    {
        int iCount = 0;
        char Arr[] = str.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= '0' && Arr[i] <= '9')
            {
                iCount++;
            }
        }
        return iCount;
    }
     public int CountSpace(String str)
    {
        int iCount = 0;
        char Arr[] = str.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == ' ')
            {
                iCount++;
            }
        }
        return iCount;
    }

      public int CountSpecial(String str)
    {
        int iCount = 0;
        char Arr[] = str.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
         if((Arr[i] >= '!' && Arr[i] <= '/') ||
            (Arr[i] >= ':' && Arr[i] <= '@')||
            (Arr[i] >= '[' && Arr[i] <= '`')||
            (Arr[i] >= '{' && Arr[i] <= '~')   
           )
            {
                iCount++;
            }
        }
        return iCount;
    }
}


