import java.util.ArrayList;

public class CSC300BibleHW2Generation
{
	long population = 7700000000l;
	long trueDisciples = 13;
	long catechists = 13;
	int time = 0;
	private int birthDay = 0;
	private int canTrainDay = 0;
	private int parentDay = 4;
	private int deathDay = 18;
	
	public CSC300BibleHW2Generation(ArrayList <CSC300BibleHW2Generation> gen, long population, int birthDay)
	{
		this.birthDay = birthDay;
		this.canTrainDay = birthDay + 6;
		this.parentDay = birthDay + 10;
		this.deathDay = birthDay + 18;
		gen.add(this);
	}
	
	
}
