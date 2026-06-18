#include<iostream>
using namespace std;

class ArrayX
{
private:
    int *Arr;
    int iSize;

public:
    // Parameterized constructor with default argument
    ArrayX(int X = 5)

    {
        iSize = X;
        Arr = new int[iSize];
    }

    // Destructor
    ~ArrayX()
    {
        delete[] Arr;
    }

    void Accept()
    {
        cout << "Enter the elements:\n";

        for(int iCnt = 0; iCnt < iSize; iCnt++)
        {
            cin >> Arr[iCnt];
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

    int Summation()
    {
        int iSum = 0;

        for(int iCnt = 0; iCnt < iSize; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }

        return iSum;
    }
};

int main()
{
    ArrayX *aobj = NULL;
    int iLength = 0;
    int iRet = 0;

    cout << "Enter the number of elements: ";
    cin >> iLength;

    aobj = new ArrayX(iLength);

    aobj->Accept();
    aobj->Display();

    iRet = aobj->Summation();
    cout << "Summation is: " << iRet << endl;

    delete aobj;

    return 0;
}


