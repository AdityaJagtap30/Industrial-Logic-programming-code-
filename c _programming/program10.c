//////////////////////////////////////////////////////////////////////////
//
//   Include required heder files
//
//////////////////////////////////////////////////////////////////////////


#include<stdio.h>
 
//////////////////////////////////////////////////////////////////////////
// 
// function name : AddTwo Number
// Input:          float,float
// Output:         float
// Description :   Perform addition of 2 float
// Date :          08/05/2026
// Author :        Aditya Santosh Jagtap
//////////////////////////////////////////////////////////////////////////

float AddTwoNumbers(
                     float fNo1,      // First Input
                     float fNo2      // Second Input
                    )
{
     float fAns = 0.0f;              // Varible to store Result

     fAns = fNo1 + fNo2;             // Perform Addition

     return fAns;
}

//////////////////////////////////////////////////////////////////////////
//
//   Application to perform Addition of two float Values
//
//////////////////////////////////////////////////////////////////////////
int main()
{
   
      float fValue1 = 0.0f;              // to store first input
      float fValue2 = 0.0f;             // to store Second input
      float fResult = 0.0f;             // to Store result

     printf("Enter First No :\n");
     scanf("%f",&fValue1);

     printf("Enter Second No :\n");
     scanf("%f",&fValue2);
 
     fResult = AddTwoNumbers(fValue1 , fValue2);     
     
     printf("Addition is : %f\n",fResult);

    return 0;
}                       

//////////////////////////////////////////////////////////////////////////
//
//   Input : 10.0  11.0
//   Output: 21.0
//
//////////////////////////////////////////////////////////////////////////