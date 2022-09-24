
public class Main 
{

	public static void main(String[] args) 
	{
		String str = "Where am I? OH MY GOD! A GIANT PERSON! Hello! Giant! I am here to talk to you about subscribing to our channel! And done, bye! What the heck just happened?";
		String key = "I";
		
		
		int numWords = CSC300HW4.uniqueSubStringCount(str, key);
		System.out.println("The number of times '" + key + "' occurs is: " + numWords);
	}	
}
