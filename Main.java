
public class Main 
{

	public static void main(String[] args) 
	{
		String NameList[]=
		{
			"Grif",
			"Simmons",
			"Sarge",
			"Lopez",
			"Donut",
			"Church",
			"Tucker",
			"Caboose",
			"Tex",
			"Sheila",
			"Doc",
			"O'Malley",
			"Wyoming"
		};
		
		for(int i=0; i<NameList.length; i++)
		{
			System.out.println("Does the name " + NameList[i] + " have all unique characters?  " + CharacterSort.isAllUniqueChar(NameList[i]));
		}
	}

}
