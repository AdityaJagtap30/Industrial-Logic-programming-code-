#include<stdio.h>

int main()
{
   
  float fValue1 = 0.0f;              // to store first input
  float fValue2 = 0.0f;             // to store Second input
  float fResult = 0.0f;             // to Store result

     printf("Enter First No :\n");
     scanf("%f",&fValue1);

     printf("Enter Second No :\n");
     scanf("%f",&fValue2);

    fResult = fValue1 + fValue2;     // Perform the Addition
     
     printf("Addition is : %f\n",fResult);

    return 0;
}                       