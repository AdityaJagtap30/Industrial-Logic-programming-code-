#include<iostream>
using namespace std;

#pragma pack(1)
 class ArrayX
 {   
    public:
         int *Arr;
         int iSize;
      
     
      ArrayX(int X)  //Paramatrised Constructor
      {
        cout<<"inside constructor\n";
        iSize = X;              // characteristics initialisation
        Arr = new int[iSize];  // Resource allocation
      }

      ~ArrayX()  // distructor
      {
         cout<<"inside Distructor\n";
        delete []Arr;   //Resource Deallocation
      }
  };
int main()

{
   // static memory allocation for object
   // Arrayx aobj1(5); 
     ArrayX *aobj1 = new ArrayX(5);
      delete aobj1;
      cout<<"End of main\n";
  
 
    return 0;
}