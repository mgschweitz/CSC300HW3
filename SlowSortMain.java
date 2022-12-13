import java.util.Arrays;

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
//      -----------------------------------
        int[] masterListTwo = new int[10000];
        for(int j = 0; j < masterListTwo.length; j++)
        {
        	masterListTwo[j] = j+1;
        }
        shuffle(masterListTwo);
//      -----------------------------------
        int[] masterListThree = new int[10000];
        for(int a = 0; a < masterListThree.length; a++)
        {
        	masterListThree[a] = a+1;
        }
        shuffle(masterListThree);
//      -----------------------------------
        int[] masterListFour = new int[10000];
        for(int b = 0; b < masterListFour.length; b++)
        {
        	masterListFour[b] = b+1;
        }
        shuffle(masterListFour);
//      -----------------------------------        
        int[] masterListFive = new int[10000];
        for(int c = 0; c < masterListFive.length; c++)
        {
        	masterListFive[c] = c+1;
        }
        shuffle(masterListFive);
//        -----------------------------------
        int[] masterListSix = new int[10000];
        for(int d = 0; d < masterListSix.length; d++)
        {
        	masterListSix[d] = d+1;
        }
        shuffle(masterListSix);
//      -----------------------------------
      int[] masterListSeven = new int[10000];
      for(int e = 0; e < masterListSeven.length; e++)
      {
      	masterListSix[e] = e+1;
      }
      shuffle(masterListSix);
//-----------------------------------------------------------------------------------------
		
		BubbleSort x = new BubbleSort();
		long timeBubbleStarted = System.currentTimeMillis();
		int bubbleArray[] = masterList;
		x.bubbleSort(bubbleArray);
		System.out.println("Sorted Bubble Array");
		x.printBubbleArray(bubbleArray);
		System.out.println("Bubble Sort lasted for " + (System.currentTimeMillis() - timeBubbleStarted) + " milliseconds");
		System.out.println("");
		
		SelectionSort y = new SelectionSort();
		long timeSelectionStarted = System.currentTimeMillis();
		int selectionArray[] = masterListTwo;
		y.selectionSort(selectionArray);
		System.out.println("Sorted Selection Array");
		y.printSelectionArray(selectionArray);
		System.out.println("Selection Sort lasted for " + (System.currentTimeMillis() - timeSelectionStarted) + " milliseconds");
		System.out.println("");
		
		InsertionSort z = new InsertionSort();
		long timeInsertionStarted = System.currentTimeMillis();
		int insertArray[] = masterListThree;
		z.insertionSort(insertArray);
		System.out.println("Sorted Insertion Array");
		z.printInsertArray(insertArray);
		System.out.println("Insertion Sort lasted for " + (System.currentTimeMillis() - timeInsertionStarted) + " milliseconds");
		System.out.println("");
		
		ShellSort a = new ShellSort();
		long timeShellStarted = System.currentTimeMillis();
		int shellArray[] = masterListFour;
		a.shellSort(shellArray);
		System.out.println("Sorted Shell Array");
		a.printShellArray(shellArray);
		System.out.println("Shell Sort lasted for " + (System.currentTimeMillis() - timeShellStarted) + " milliseconds");
		System.out.println("");
		
		int[] numbers = masterListFive;
		long timeMergeStarted = System.currentTimeMillis();
		System.out.println("MergeSort:");
	    MergeSort.mergeSort(numbers, 0, numbers.length - 1);
	    System.out.println("SORTED:   " + Arrays.toString(numbers));
	    System.out.println("Merge Sort lasted for " + (System.currentTimeMillis() - timeMergeStarted) + " milliseconds");
		System.out.println("");
		
	    int[] quickNumbers = masterListSix;
	    long timeQuickStarted = System.currentTimeMillis();
	    System.out.println("QuickSort:");
	    QuickSort.quicksort(quickNumbers, 0, quickNumbers.length - 1);
	    System.out.println("SORTED: " + Arrays.toString(quickNumbers));
	    System.out.println("Quick Sort lasted for " + (System.currentTimeMillis() - timeQuickStarted) + " milliseconds");
		System.out.println("");
		
		int[] arrayMergeTwo = masterListSeven;
		long timeMergeTwoStarted = System.currentTimeMillis();
		System.out.println("Second kind of MergeSort: ");
		MergeSortTwo.mergeSortTwo(arrayMergeTwo);
		System.out.println("SORTED: " + Arrays.toString(arrayMergeTwo));
		System.out.println("The new MergeSort lasted for: " + (System.currentTimeMillis() - timeMergeTwoStarted) + " milliseconds");
		System.out.println("");
	}

}