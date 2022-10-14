
public class InsertionSort 
{
	void insertionSort(int insertArray[])
	{
		int n = insertArray.length;
		for(int i = 1; i < n; ++i)
		{
			int key = insertArray[i];
			int j = i - 1;
			
			while(j >= 0 && insertArray[j] > key)
			{
				insertArray[j + 1] = insertArray[j];
				j = j - 1;
			}
			insertArray[j + 1] = key;
		}
	}
	
	void printInsertArray(int insertArray[])
	{
		int n = insertArray.length;
		for(int i = 0; i < n; ++i)
		{
			System.out.print(insertArray[i] + " ");
		}
		System.out.println();
	}
}
