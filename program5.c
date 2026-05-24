/*  
      Algorithm
START
       
        Accept first no as NO!
        Accept Second no as No2
        perform Addition No1 and NO2
        Display the Result
STOP

*/

#include<stdio.h>

int main()
{
   float i,j,k;

     printf("Enter First No :\n");
     scanf("%f",&i);

     printf("Enter Second No :\n");
     scanf("%f",&j);

     k = i + j;
     
     printf("Addition is : %f\n",k);

    return 0;
}