

#include<stdio.h>

typedef unsigned int UINT;
int main()
{    // possition 4
    UINT iNo = 0;
    UINT iMask = 0xFFFFFFF7;
    UINT iPos = 0;
    
    printf("Enter number :\n");
    scanf("%d",&iNo);
   
    iNo= iNo & iMask;
    printf("Updated number : %d\n",iNo);

    return 0;
}