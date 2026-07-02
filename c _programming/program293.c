#include<stdio.h>

void ReversDisplay(char *str)
{
    char *start = NULL;

    start = str;

    while(*str != '\0')
    {
        str++;
    }

    str--;

    while(start <= str)
    {
        printf("%c",*str);
        str--;
    }
    printf("\n");

}

int main()
{
    char Arr[50] = {'\0'};
    printf("Enter String :\n");
    scanf("%[^'\n']s",Arr);

    ReversDisplay(Arr);

    return 0;
}

