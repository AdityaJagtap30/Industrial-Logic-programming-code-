#include<stdio.h>                        //pattern

void strrevX(char *str)
{
    char *start = NULL;
    char *end = NULL;
    char temp = '\0';

    start = str;

    while(*str != '\0')
    {
        str++;
    }

    str--;
    end = str;

    while(start <= end)
    {
       temp = *start;
       *start = *end;
       *end = temp;
       start++;
       end--;
    }
    printf("\n");

}

int main()
{
    char Arr[50] = {'\0'};
    printf("Enter String :\n");
    scanf("%[^'\n']s",Arr);

    ReversDisplay(Arr);
    printf("Updated String :%s",Arr);

    return 0;
}

