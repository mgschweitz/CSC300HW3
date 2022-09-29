
public class CSC300HW5 
{
	public static int searchX(int[] array, int key)
	    {
	        int lowest = 0;
	        int highest = array.length;
	        int middle = (lowest + highest) /2;

	        while (true) 
	        {

	            if (array[middle] > key)
	            {
	                highest = middle -1;
	                middle = (lowest + highest) /2;
	            }
	            else if (array[middle] < key)
	            {
	                lowest = middle +1;
	                middle = (lowest + highest) /2;
	            } else if (array[middle] == key)
	            {
	                return middle;
	            }
	            else
	            {
	                return -1;
	            }

	        }
	    }
	public static String searchY(int[][] array2, int key)
	    {
	        int lowest = 0;
	        int highest = array2.length;
	        int middle = (lowest + highest) /2;
	        int innerCord = 0;


	        while (true) 
	        {
	            if (array2[middle][0] > key) 
	            {
	                highest = middle -1;
	                middle = (lowest + highest) /2;
	            }
	            else if (array2[middle][array2[middle].length-1] < key) 
	            {
	                lowest = middle +1;
	                middle = (lowest + highest) /2;
	            }
	            else
	            {
	                innerCord = searchX(array2[middle], key);

	                return (middle +", " + innerCord);
	            }

	        }
	    }
	
	//return tacos

}
