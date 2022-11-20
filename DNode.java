
public class DNode 
{
	int payload;
	DNode next;
	DNode prev;
	
	DNode(int data)
	{
		this.payload = data;
		this.prev = null;
		this.next = null;
	}
}
