
public class CSC300HW5 
{
	public static int searchX(int[] arr, int key)
	    {
	        int lowest = 0;
	        int highest = arr.length;
	        int middle = (lowest + highest) /2;

	        while (true) 
	        {

	            if (arr[middle] > key)
	            {
	                highest = middle -1;
	                middle = (lowest + highest) /2;
	            }
	            else if (arr[middle] < key)
	            {
	                lowest = middle +1;
	                middle = (lowest + highest) /2;
	            } else if (arr[middle] == key)
	            {
	                return middle;
	            }
	            else
	            {
	                return -1;
	            }

	        }
	    }
	public static String searchY(int[][] arrY, int key)
	    {
	        int lowest = 0;
	        int highest = arrY.length;
	        int middle = (lowest + highest) /2;
	        int innerCord = 0;


	        while (true) 
	        {
	            if (arrY[middle][0] > key) 
	            {
	                highest = middle -1;
	                middle = (lowest + highest) /2;
	            }
	            else if (arrY[middle][arrY[middle].length-1] < key) 
	            {
	                lowest = middle +1;
	                middle = (lowest + highest) /2;
	            }
	            else
	            {
	                innerCord = searchX(arrY[middle], key);

	                return (middle +", " + innerCord);
	            }

	        }
	    }
	
	//return tacos

}
