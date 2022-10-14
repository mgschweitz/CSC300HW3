
public class SelectionSort 
{
	void selectionSort(int selectionArray[])
	{
		int n = selectionArray.length;
		for(int i = 0; i < n-1; i++)
		{
			int smallestElement = i;
			for(int j = i + 1; j < n; j++)
			{
				if(selectionArray[j] < selectionArray[smallestElement])
				{
					smallestElement = j;
				}
			int temp = selectionArray[smallestElement];
			selectionArray[smallestElement] = selectionArray[i];
			selectionArray[i] = temp;
			}
		}
	}
	
	void printSelectionArray(int selectionArray[])
	{
		int n = selectionArray.length;
		for(int i = 0; i < n; i++)
		{
			System.out.print(selectionArray[i] + " ");
		}
		System.out.println();
	}
}
