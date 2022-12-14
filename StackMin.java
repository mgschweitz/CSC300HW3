import java.util.*;

public class StackMin 
{
	Stack<Integer> x;
	Integer minElement;
	
	StackMin() { x = new Stack<Integer>(); }
	
	void min()
	{
		if(x.isEmpty())
			System.out.println("Stack is empty");
		
		else
			System.out.println("The minimum element in the stack is " + minElement);
	}
	
	void peek()
	{
		if(x.isEmpty()) 
		{
			System.out.println("Stack is empty");
			return;
		}
		Integer y = x.peek();
		
		System.out.println("Top element is ");
		
		if(y < minElement)
			System.out.println(minElement);
		else
			System.out.println(y);
	}
	
	void pop()
	{
		if(x.isEmpty())
		{
			System.out.println("Stack is empty");
			return;
		}	
		System.out.println("Top element removed: ");
		Integer y = x.pop();
		
		if(y < minElement)
		{
			System.out.println(minElement);
			minElement = 2 * minElement - y;
		}
		else
			System.out.println(y);
	}
	
	void push(Integer z)
	{
		if(x.isEmpty())
		{
			minElement = z;
			x.push(z);
			System.out.println("Number Inserted: " + z);
			return;
		}
		
		if(z < minElement)
		{
			x.push(2 * z - minElement);
			minElement = z;
		}
		
		else
			x.push(z);
		
		System.out.println("Number Inserted: " + z);
	}
}








