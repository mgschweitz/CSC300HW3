
public class CharacterSort 
{
	public static boolean isAllUniqueChar(String str)
    {

        for(int i = 0; i < str.length(); i++)
        {
            for(int j = i + 1; j < str.length(); j++)
            {
                if (str.charAt(i) == str.charAt(j))
                {
                    return false;
                }
            }
        }

        return true;
    }
}
