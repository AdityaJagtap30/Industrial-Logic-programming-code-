#include<stdio.h>

typedef unsigned int UINT;
int main()
{
  UINT iNo = 0;
  UINT iMask = 0x1;
  UINT iAns = 0;
  UINT iPos= 0;



  printf("Enter number : \n");
  scanf("%d",&iNo);

 printf("Enter the Possition : \n");
 scanf("%d",&iPos);
 
 iMask = iMask & iPos;

  iAns = iNo & iMask;

  if(iAns == iMask)
  {
    printf("Bit in ON\n");
  }
  else
  {
      printf("Bit in OFF\n"); 
  }
 

  

    return 0;
}