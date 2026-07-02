#include<stdio.h>

int main()
{
  int iNo = 0;
  int iMask = 4;
  int iAns = 0;


  printf("Enter number : \n");
  scanf("%d",&iNo);
 
  iAns = iNo & iMask;

  if(iAns == iMask)
  {
    printf("Third Bit in ON\n");
  }
  else
  {
      printf("Third Bit in OFF\n"); 
  }
 

  

    return 0;
}