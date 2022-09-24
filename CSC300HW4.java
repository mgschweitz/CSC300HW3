
public class CSC300HW4 
{
	public static int uniqueSubStringCount(String str, String Key)
    {
        int uniqueOccurences = 0;
        {
        	String[] arrOfStr = splitStringWithSpace(str);
    		
    		for(int i = 0; i < arrOfStr.length; i++)
    		{
    			if(stringCompareIgnoreCase(Key, arrOfStr[i]))
    			{
    				uniqueOccurences ++;
    			}
    		}
        }
        return uniqueOccurences;
    }

    public static boolean stringCompareIgnoreCase(String s1, String s2) 
    {
        return s1.toLowerCase().equals(s2.toLowerCase());
    }

    public static String[] splitStringWithSpace(String input) 
    {
        return input.split("[ ?!,]+");
    }
}
