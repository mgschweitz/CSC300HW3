
class QuickSort
{
	public static int partition(int[] quickNumbers, int startIndex, int endIndex) {

		   int midpoint = startIndex + (endIndex - startIndex) / 2;
		   int pivot = quickNumbers[midpoint];

		   int low = startIndex;
		   int high = endIndex;
		   
		   boolean done = false;
		   while (!done) {

		      while (quickNumbers[low] < pivot) {
		         low = low + 1;
		      }
		      while (pivot < quickNumbers[high]) {
		         high = high - 1;
		      }
		      
		      if (low >= high) {
		         done = true;
		      }
		      else {
		         int temp = quickNumbers[low];
		         quickNumbers[low] = quickNumbers[high];
		         quickNumbers[high] = temp;
		         low++;
		         high--;
		      }
		   }

		   return high;
		}
	
	public static void quicksort(int[] quickNumbers, int startIndex, int endIndex) {

		   if (endIndex <= startIndex) {
		      return;
		   }

		   int high = partition(quickNumbers, startIndex, endIndex);

		   quicksort(quickNumbers, startIndex, high);

		   quicksort(quickNumbers, high + 1, endIndex);
		}
}