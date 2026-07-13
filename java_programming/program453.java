
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
class program452
{
    public static void main(String A[])
    {
       SiglyLL sobj = new SiglyLL();

       sobj.InsertFirst(51);
       sobj.InsertFirst(21);
       sobj.InsertFirst(11);

    }
}