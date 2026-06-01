
#include<stdio.h>

 void CallByValue(int iNo)
 {
    iNo++;
 }
int main()
{
  
  int iValue = 11;    // call by value

  CallByValue(iValue);

  printf("Value after function call: %d\n",iValue);
 

  
 
    return 0;
}