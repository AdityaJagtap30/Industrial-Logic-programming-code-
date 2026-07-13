#include<iostream>
using namespace std;

#pragma pack(1)
 class ArrayX
 {   
    public:
         int *Arr;
         int iSize;
      
      ArrayX()         //Default Constructor
     {

     }
      ArrayX(int X)  //Paramatrised Constructor
      {

      }
  };
int main()

{
   ArrayX aobj1;    //Default
   ArrayX aobj2(5); // Paramatrised

   cout<<sizeof(aobj1)<<endl; 
 
    return 0;
}