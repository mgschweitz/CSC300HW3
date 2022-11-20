
public class SlowSortMain 
{
	public static void shuffle(int [] arr) 
	{
        for (int i = 0; i < arr.length; i++) 
        {
            int index = (int) (Math.random() * arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }
            
	public static void main(String[] args) 
	{
		
		int[] masterList = new int[10000];
        for (int i = 0; i < masterList.length; i++)
        {
            masterList[i] = i+1;
            System.out.print(masterList[i] + " ");
        }
        shuffle(masterList);
        System.out.println("\n=-=-=-=-=-=-=-=-\n");

        
        for (int i = 0; i < masterList.length; i++)
        {
            System.out.print(masterList[i] + " ");
        }
        System.out.println("\n=-=-=-=-=-=-=-=-\n");
        
//-----------------------------------------------------------------------------------------
		
		BubbleSort x = new BubbleSort();
		int bubbleArray[] = {88, 44, 66, 22, 33, 99, 11, 55, 77};
		x.bubbleSort(bubbleArray);
		System.out.println("Sorted Bubble Array");
		x.printBubbleArray(bubbleArray);
		
		SelectionSort y = new SelectionSort();
		int selectionArray[] = {88, 44, 66, 22, 33, 99, 11, 55, 77};
		y.selectionSort(selectionArray);
		System.out.println("Sorted Selection Array");
		y.printSelectionArray(selectionArray);
		
		InsertionSort z = new InsertionSort();
		int insertArray[] = {88, 44, 66, 22, 33, 99, 11, 55, 77};
		z.insertionSort(insertArray);
		System.out.println("Sorted Insertion Array");
		z.printInsertArray(insertArray);
		
		ShellSort a = new ShellSort();
		int shellArray[] = {88, 44, 66, 22, 33, 99, 11, 55, 77};
		a.shellSort(shellArray);
		System.out.println("Sorted Shell Array");
		a.printShellArray(shellArray);
		
		
	}

}