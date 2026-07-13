
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
    public node first;
    public int iCount;

    public SiglyLL()
    {
        System.out.println("Inside constructor");
        this.first = null;
        this.iCount = 0;
    }
}
class program451
{
    public static void main(String A[])
    {
       SiglyLL sobj = new SiglyLL();

    }
}