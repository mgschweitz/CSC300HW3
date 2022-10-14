import java.util.ArrayList;

public class generation 
{
	long population = 0l;
	long disciples = 0L;
	long catechists = 0L;
	private int bDay = 0;
	private int tDay = 0;
	private int pDay = 10;
	private int dDay = 0;
	private long timeToDie = -1;
	
	private int numCatechizedPerCycle = 2;
	
	public generation(ArrayList<generation> gen, long population, int bDay)
	{
		//fields
		this.population = population;
		this.bDay = bDay;
		this.tDay = bDay + 6;
		this.pDay = bDay + 10;
		this.dDay = bDay + 24;
		gen.add(this);
	}
	
	//
//		generation nextGeneration = gen.get(gen.indexOf(this)+1);
//		generation prevGeneration = gen.get(gen.indexOf(this)-1);
	
	public long[] checkYear(ArrayList<generation> gen, long totalPop, long totalDisciples, int year) 
	{
		long popToReturn = 0;
		long discToReturn = 0;
		long timeToDie = -1;
		//check and incriment generation
		if(year == this.pDay)
		{
			long popToAdd = totalPop / 2;
			new generation(gen, popToAdd, year);
			popToReturn = popToAdd;
		}
		
		//incriment catechists
		if(year >= this.tDay)
		{
			this.catechists = this.disciples;
		}
		
		//train & catachize disciples
		long disciplesCatechized = (this.catechists * numCatechizedPerCycle);
		discToReturn = disciplesCatechized;
		if((this.disciples + disciplesCatechized) > this.population)
		{
			long rolloverDisciples = (this.population + disciplesCatechized) - this.population;
			disciplesCatechized -= rolloverDisciples;
			this.incrimentDisciples(gen, disciplesCatechized);
			gen.get(0).incrimentDisciples(gen, rolloverDisciples);
		} else
		{
			this.incrimentDisciples(gen, disciplesCatechized);			
		}
		
		//die
		if(year >= this.dDay)
		{
			this.timeToDie = gen.indexOf(this);
		}
		
		//formatting return array, [0] is poulation incriment, [1] is disciple incriment, [3] is which generation dies, -1 being none.
		long[] arrtoReturn = {popToReturn, discToReturn, this.timeToDie};
		return arrtoReturn;
		
	}
	
	public void incrimentDisciples(ArrayList<generation> gen, long disciplesCatechized)
	{
		if(gen.indexOf(this) < gen.size() -1 && gen.get(gen.indexOf(this)+1).disciples < gen.get(gen.indexOf(this)+1).population)
		{
//			gen.get(nextGeneration).disciples += disciplesCatechized;	
			gen.get(gen.indexOf(this)+1).disciples += disciplesCatechized;
		} 
		else if(this.disciples < this.population)
		{
			
			this.disciples += disciplesCatechized;
		} 
		else if(gen.indexOf(this) > 0 && this.disciples >= this.population && gen.get(gen.indexOf(this)-1).disciples < gen.get(gen.indexOf(this)-1).population )
		{
//			gen.get(prevGeneration).disciples += disciplesCatechized;	
			gen.get(gen.indexOf(this)-1).disciples += disciplesCatechized;	
		}
	}
	
	
	
	
}