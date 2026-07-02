#include<stdio.h>

typedef unsigned int UINT;
int main()
{
  UINT iNo = 0;
  UINT iMask = 4096;
  UINT iAns = 0;


  printf("Enter number : \n");
  scanf("%d",&iNo);
 
  iAns = iNo & iMask;

  if(iAns == iMask)
  {
    printf("Thirteen Bit in ON\n");
  }
  else
  {
      printf("Thirteen Bit in OFF\n"); 
  }
 

  

    return 0;
}