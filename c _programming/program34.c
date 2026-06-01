#include<stdio.h>

void Display(int iNO)
{
   int iCnt = 0;

   //Filter
   if(iNO < 0)
   {

    printf("Invalid Input\n");
    return;
   }

  for(iCnt = iNO; iCnt >=0; iCnt--)
   {
    printf("%d\n",iCnt);
   }

}

int main()
{

   int iValue = 0;

   printf("Enter the Frequency :\n");
   scanf("%d",&iValue);

   Display(iValue);
   

    return 0;
}