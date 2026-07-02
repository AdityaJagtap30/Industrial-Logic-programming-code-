#include<stdio.h>

typedef unsigned int UINT;
int main()
{
  UINT iNo = 0;
  UINT iMask = 64;
  UINT iAns = 0;


  printf("Enter number : \n");
  scanf("%d",&iNo);
 
  iAns = iNo & iMask;

  if(iAns == iMask)
  {
    printf("Seventh Bit in ON\n");
  }
  else
  {
      printf("Seventh Bit in OFF\n"); 
  }
 

  

    return 0;
}