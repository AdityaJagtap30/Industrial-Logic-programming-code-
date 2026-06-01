#include<stdio.h>
#include<stdlib.h>

int main()
{
  int*Brr = NULL;
  int iLength = 0,iCnt = 0;

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
    
    // Dellocate the memory

    free(Brr);
    return 0;
}
