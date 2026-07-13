#include<iostream>
using namespace std;

#pragma pack(1)
 class ArrayX
 {   
    private:
         int *Arr;
         int iSize;

    public:
    
     //parametrised constructor with Default argument
     ArrayX(int X = 5)  
      {
        
        iSize = X;              
        Arr = new int[iSize];  
      }


      ~ArrayX()  
      {
        
        delete []Arr;   
      }
      public:
      void Accept()
      {
         int iCnt = 0;
          cout<<"Enter the elements :\n";

          for(iCnt = 0;iCnt < iSize;iCnt++)
          {
               cin>>Arr[iCnt];
          }
        
      }

         void Display()
    {
        cout << "Elements of Array are:\n";

        for(int iCnt = 0; iCnt < iSize; iCnt++)
        {
            cout << Arr[iCnt] << "\t";
        }
        cout << endl;
    }
  };


   int main()

{
   
     ArrayX *aobj = NULL;    // paramaterised constructor
     int iLength = 0;

     cout<<"Enter the no of ellement :\n";
     cin>>iLength;

       aobj =  new ArrayX(iLength);
  
       aobj->Accept();
       aobj->Display();


       delete aobj;
   
      
    
  
 
    return 0;
}