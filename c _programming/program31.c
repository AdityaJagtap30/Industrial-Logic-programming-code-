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

  for(iCnt = 1; iCnt <= iNO; iCnt++)
   {
    printf("%d :Jay Ganesh.....\n",iCnt);
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