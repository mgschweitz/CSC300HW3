
public class MainTwo 
{

	public static void main(String[] args) 
	{
		StackMin x = new StackMin();
		
		x.push(12);
		x.push(4);
		x.push(3);
		x.min();
		x.push(15);
		x.push(18);
		x.min();
		x.pop();
		x.pop();
		x.pop();
		x.min();
	}

}
