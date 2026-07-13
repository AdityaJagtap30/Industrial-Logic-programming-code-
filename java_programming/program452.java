
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
       node newn;
       if(first == null)
       {
          first = newn;
       }
       else
       {
          newn.next = first;
          first = newn;
       }
    }

    public InsertLast(int iNo)
    {
       node newn;
       if(first == null)
       {
          first = newn;
       }
       else
       {
          while(first.new != null)
          {
            first.next = newn;
            newn = first;

          }
       }
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
class program452
{
    public static void main(String A[])
    {
       SiglyLL sobj = new SiglyLL();

    }
}