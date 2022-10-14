
public class BubbleSort 
{
	void bubbleSort(int bubbleArray[])
	{
		int n = bubbleArray.length;
		for(int i = 0; i < n - 1; i++)
		{	
			for(int j = 0; j < n - 1; j++)
			{
				if(bubbleArray[j] > bubbleArray[j + 1])
				{
					int temp = bubbleArray[j];
					bubbleArray[j] = bubbleArray[j + 1];
					bubbleArray[j + 1] = temp;
				}
			}
	
		}
	}

	void printBubbleArray(int bubbleArray[])
	{
		int n = bubbleArray.length;
		for(int i = 0; i < n; i++)
		{
			System.out.print(bubbleArray[i] + " ");
		}
		System.out.println();
	}
}
