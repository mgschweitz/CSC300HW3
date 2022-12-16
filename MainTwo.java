import java.util.Random;

public class MainTwo 
{
	public static int randomize(int min, int max)
	{
		Random rd = new Random();
		int num = rd.nextInt(max-min) + min;
		return num;
	}
	
	public static void main(String[] args) throws Exception
	{
//		StackMin x = new StackMin();
//		
//		x.push(12);
//		x.push(4);
//		x.push(3);
//		x.min();
//		x.push(15);
//		x.push(18);
//		x.min();
//		x.pop();
//		x.pop();
//		x.pop();
//		x.min();
		
		
//----------------------------------------------------------------------------------------
//		Hash Table Assignment #12 starts here
//		String[] keyList = new String[10000];
//		for (int i = 0; i < keyList.length; i++)
//		{
//			int r = randomize(0, 1000000);
//			String s = Integer.toString(r);
//			keyList[i] = s;
//			System.out.print(keyList[i] + " ");
//		}
//
//		long startTime;
//		long endTime;
//		
//		Danny table = new Danny();
//
//		for(int i =0; i < keyList.length-1; i++)
//		{
//			table.Add(keyList[i], Integer.toString(i));
//		}
//		
//		startTime = System.currentTimeMillis();
//		for(int i = 0; i < 100; i++)
//		{
//			int num = randomize(0, 100);
//			System.out.println("-----------------");
//			System.out.println("(" + table.Get(keyList[num]).Value + " is key " + keyList[num] + ") ");
//		}
//		endTime = System.currentTimeMillis();
//		
//		System.out.println("Time search runs is " + (endTime - startTime) + " milliseconds");
	}

}
