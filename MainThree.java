import java.util.Random;

public class MainThree 
{
	public static int randomize(int min, int max)
	{
		Random rd = new Random();
		int num = rd.nextInt(max-min) + min;
		return num;
	}
	
	public static void main(String[] args) throws Exception
	{
//		int[] keyList = new int[10000];
//		for(int i = 1; i < keyList.length; i++)
//		{
//			int r = randomize(1, 100000);
//			keyList[i] = r;
//			System.out.print(keyList[i] + " ");
//		}	
//		
//		long startTime;
//		long endTime;
//		
//		DannyTwo table = new DannyTwo();
//
//		for(int i = 0; i < keyList.length-1; i++)
//		{
//			table.Add(keyList[i], i);
//		}
//		
//		startTime = System.currentTimeMillis();
//		for(int i = 0; i < 100; i++)
//		{
//			int num = randomize(0, 100);
//			System.out.println("\n-----------------" + num);
//			System.out.println("(" + table.Get(keyList[num]).Value + " is key " + keyList[num] + ") ");
//		}
//		endTime = System.currentTimeMillis();
//		
//		System.out.println("Time search for DannyTwo is " + (endTime - startTime) + " milliseconds");
//		
////---------------------------------------------------------------------------------------------------
//		
//		long startTimeTwo;
//		long endTimeTwo;
//		
//		Steve chair = new Steve();
//		
//		for(int i = 0; i < keyList.length-1; i++)
//		{
//			chair.HashInsert(keyList[i], i);
//		}
//		
//		startTimeTwo = System.currentTimeMillis();
//		for(int i = 0; i < 100; i++)
//		{
//			int num = randomize(0, 100);
//			System.out.println("\n----------------" + num);
//			System.out.println("(" + chair.Get(keyList[num]).Value + "is key " + keyList[num] + ")");
//		}
//		endTimeTwo = System.currentTimeMillis();
//		
//		System.out.println("Time search for Steve is " + (endTimeTwo - startTimeTwo) + " milliseconds");
	}

}
