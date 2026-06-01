#include<stdio.h>
#include<stdlib.h>

int Summation(int Arr[],int iSize)
{
    int iCnt = 0;
    int iSum = 0;

   
    for(iCnt = 0;iCnt < iSize ; iCnt++)
    {
       iSum = iSum + Arr[iCnt];
    }
    return iSum;
}
int main()
{
  int*Brr = NULL;
  int iLength = 0,iCnt = 0,iRet = 0;

  printf("Enter number of ellements :\n");  // step 1. Accept the no of ellement
  scanf("%d",&iLength);

// step2 . Allocate the memory
  Brr = (int*)malloc(iLength * sizeof(int));

  // step 3 .Accept the value from user
  
   printf("Enter the ellements :\n");

  for(iCnt = 0;iCnt < iLength;iCnt++)
  {
    scanf("%d",&Brr[iCnt]);
  }

 
    //step 4 use the memory
    iRet = Summation(Brr,iLength);

    printf("Addition is :%d\n",iRet);
    
    // Dellocate the memory

    free(Brr);
    return 0;
}
