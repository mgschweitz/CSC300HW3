
class QuickSort
{
	int partition(int[] numbers, int startIndex, int endIndex) {

		   int midpoint = startIndex + (endIndex - startIndex) / 2;
		   int pivot = numbers[midpoint];

		   int low = startIndex;
		   int high = endIndex;
		   
		   boolean done = false;
		   while (!done) {

		      while (numbers[low] < pivot) {
		         low = low + 1;
		      }
		      while (pivot < numbers[high]) {
		         high = high - 1;
		      }
		      
		      if (low >= high) {
		         done = true;
		      }
		      else {
		         int temp = numbers[low];
		         numbers[low] = numbers[high];
		         numbers[high] = temp;
		         low++;
		         high--;
		      }
		   }

		   return high;
		}
	
	void quicksort(int[] numbers, int startIndex, int endIndex) {

		   if (endIndex <= startIndex) {
		      return;
		   }

		   int high = partition(numbers, startIndex, endIndex);

		   quicksort(numbers, startIndex, high);

		   quicksort(numbers, high + 1, endIndex);
		}
}