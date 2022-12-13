
public class MergeSortTwo 
{
	public static void mergeSortTwo(int[] arrayMergeTwo) {
	    int[] temp = new int[arrayMergeTwo.length]; 
	    boolean outputToTemp = true;   

	    for (int n = 0; Math.pow(2,n) < arrayMergeTwo.length; n++) {
	        int[] input, output;
	        if (outputToTemp) {
	            input = arrayMergeTwo;
	            output = temp;
	        }
	        else {
	            input = temp;
	            output = arrayMergeTwo;
	        }
	        outputToTemp = !outputToTemp; 
	            int i = 0;
	            while (i + Math.pow(2,n) < input.length) {
	                mergeTwo(i, i + (int)Math.pow(2,n), input, output);
	                i += Math.pow(2,n + 1);
	            }

	            if (i < input.length)
	                for (int j = i; j < input.length; j++)
	                    output[j] = input[j];
	        }

	        if (outputToTemp == false)
	            for (int i = 0; i < arrayMergeTwo.length; i++)
	                arrayMergeTwo[i] = temp[i];
	    }
	
	        private static void mergeTwo(int leftStart, int rightStart, int[] input, int[] output) {
	       int i = leftStart,
	        j = rightStart,
	        k = leftStart;
	       while (i < rightStart && (j < 2 * rightStart - leftStart && j < input.length)) {
	        if (input[i] <= input[j]) {
	            output[k] = input[i];
	            i++;
	        }
	        else if (input[i] > input[j]) {
	            output[k] = input[j];
	            j++;
	        }
	        k++;
	    }
	    if (i == rightStart) {
	        while (j < output.length) {
	            output[k] = input[j];
	            j++;
	            k++;
	        }
	    }
	    else if (j == 2 * rightStart - leftStart || j == input.length) {
	        while (i < rightStart) {
	            output[k] = input[i];
	            i++;
	            k++;
	        }
	    }
	}

}
