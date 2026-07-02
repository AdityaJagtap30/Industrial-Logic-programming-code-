#include<stdio.h>

void ReversDisplay(char *str)
{
     printf("%s\n",str);
}

int main()
{
    char Arr[50] = {'\0'};
    printf("Enter String :\n");
    scanf("%[^'\n']s",Arr);

    ReversDisplay(Arr);

    return 0;
}