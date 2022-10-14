
public class CSC300BibleHW1 
{
	public static void howLongToMakeDisciples()
	{
		long trueDisciples = 13;
		long population = 7700000000l;
		int years = 0;
		
		while(trueDisciples < population)
		{
			trueDisciples += (trueDisciples*2);
			years++;
		}
		System.out.println("It took " + (years*3) + " years to convert the world to Christianity.");
	}
}
