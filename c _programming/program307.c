#include<stdio.h>

int main()
{
  int iNo = 0;
  int iDigit =0;
  int iCount = 0;

  printf("Enter number : \n");
  scanf("%d",&iNo);

  while(iNo != 0)
  {
    iDigit = iNo % 2;
    iCount = iCount + iDigit;
    iNo = iNo / 2;
  }
    printf("%d",iCount);

  

    return 0;
}