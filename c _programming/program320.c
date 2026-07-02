#include<stdio.h>

typedef unsigned int UINT;
int main()
{
  int iCnt = 0;
  for(iCnt = 0;iCnt <= 100;iCnt++)
  {
    printf("%d\t%X\n",iCnt,iCnt);
  }



    return 0;
}