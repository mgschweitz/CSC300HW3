
public class ShellSort 
{
	void shellSort(int shellArray[])
	{
		int n = shellArray.length;
		for(int gap = n / 2; gap > 0; gap /= 2)
		{
			for(int i = gap; i < n; i += 1)
			{
				int temp = shellArray[i];
				int j;
				for(j = i; j >= gap && shellArray[j - gap] > temp; j -= gap)
				{
					shellArray[j] = shellArray[j - gap];
				}
				shellArray[j] = temp;
			}
		}
	}
	
	void printShellArray(int shellArray[])
	{
		int n = shellArray.length;
		for(int i = 0; i < n; ++i)
		{
			System.out.print(shellArray[i] + " ");
		}
		System.out.println();
	}
}
