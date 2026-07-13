
class node
{
    public int data;
    public node next;

    node(int no)
    {
        this.data = no;
        this.next = null;
    }

}
class SiglyLL
{
    private node first;
    private int iCount;

    public SiglyLL()
    {
        System.out.println("Inside constructor");
        this.first = null;
        this.iCount = 0;
    }
    public void Display()
    {
         node temp = first;
         while(temp != null)
         {
            System.out.print("| "+temp.data+" | ->");
            temp = temp.next;
         }
         System.ouy.println("null");
    }
     
     public int Count()
     {
        return iCount;
     }

    public void InsertFirst(int iNo)
    {
       new node = new node(iNo);
       if(first == null)
       {
          first = newn;
       }
       else
       {
          
          newn.next = first;
          first = newn;
       }
       iCount++;
    }

    public InsertLast(int iNo)
    {
      new node = new node(iNo);
       if(first == null)
       {
          first = newn;
       }
       else
       {
          node temp = first;
          while(temp.next != null)
          {
            temp = temp.next;
          }
          temp.next = newn;
       } 
       iCount++;
       
    }

    public InsertAtPos(int iNo,int iPos)
    {

    }

    public void DeletFirst()
    {
       if(first == null)
       {
        return;
       }
       else if(first.next == null)
       {
        first = null;
       }
       else
       {
         first = first.next;
       }
       iCount--;
    }
     public void DeletLast()
    {
       if(first == null)
       {
        return;
       }
       else if(first.next == null)
       {
        first = null;
       }
       else
       {
           node temp = first;
           while(temp.next.next != null)
           {
            temp = temp.next;
           }
            temp.next = null;
       }
       iCount--;
    }

     public void DeletAtPos(int iPos)
    {

    }

}
class program454
{
    public static void main(String A[])
    {
       SiglyLL sobj = new SiglyLL();
       int iRet = 0;

       sobj.InsertFirst(51);
       sobj.InsertFirst(21);
       sobj.InsertFirst(11);

       sobj.InsertLast(101);
       sobj.InsertLast(111);
       sobj.InsertLast(121);

       sobj.Display();
       iRet = sobj.Count();
       System.out.println("No of Nodes Are :"+iRet);

       sobj.DeletFirst();
       sobj.DeletLast();
       sobj.Display();
        iRet = sobj.Count();
       System.out.println("No of Nodes Are :"+iRet);

    }
}