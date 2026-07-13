
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

    }
     public void DeletLast()
    {

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

       sobj.InsertFirst(51);
       sobj.InsertFirst(21);
       sobj.InsertFirst(11);

       sobj.InsertLast(101);
       sobj.InsertLast(111);
       sobj.InsertLast(121);

    }
}