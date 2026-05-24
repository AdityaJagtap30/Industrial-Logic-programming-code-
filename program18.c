#include<stdio.h>

int CalculateTickitPrize(int iAge)
{
   if(iAge >= 0 && iAge <=5)
   {
     return 0;
   } 
   else if(iAge >=6 && iAge<=18)
   {
    return 500;
   }
   else if(iAge >=19 && iAge<=50)
   {
    return 900;
   }
   else
   {
    return 400;
   }
}


int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Plese Enter your Age to calculate Tickit Prize :\n");
    scanf("%d",&iValue);
    
   iRet =  CalculateTickitPrize(iValue);
   
   printf("Your Tickit Prize will be %d rupees\n",iRet);


    return 0;
}