import java.util.ArrayList;

public class CSC300BibleHW2Main 
{

	public static void main(String[] args) 
	{
		long totalPopulation = 7700000000l;
		long totalDisciples = 13l;
		int year = 0;
		ArrayList<generation> gen = new ArrayList<generation>();
		generation gen1 = new generation(gen, totalPopulation, -6);
		gen1.disciples = totalDisciples;
		
		while(totalDisciples <= totalPopulation)
		{
			System.out.println("\n\n beginning while loop");
			int genToKill = -1;
			for(int i = 0; i < gen.size(); i++)
			{
				System.out.println("there are " + (gen.size()-1) + " generations. Now chekcing generation " + i);
				long[] temp = gen.get(i).checkYear(gen, totalPopulation, totalDisciples, year);
				System.out.println("testing after check year");

				totalPopulation += temp[0];
				totalDisciples += temp[1];
				if(temp[2] > -1)
				{
					genToKill = i;
					System.out.println("checking temp[2], currently: " + temp[2] + " whereas genToKill is: " + genToKill);
				}
			}
			
			if(genToKill > -1)
			{
				System.out.println("\n-=-=-=-==-=-=-=-=-==-=-==-killing gen " + genToKill + "-=-=-=-==-=-=-=--=-=-=-");
				totalPopulation -= gen.get(genToKill).population;
				totalDisciples -= gen.get(genToKill).disciples;
				gen.remove(genToKill);
				System.gc();
			}
			
			System.out.println("In the year " + (year*3) + " the world population was " + totalPopulation + " and the number of disciples was " + totalDisciples + "! ");
			year++;
		}
		//return tacos
	}
}
	