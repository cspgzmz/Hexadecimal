import java.util.Random;



public class RandomBinaryString {
	
	public static void main (String [] args)
	{
		RandomBinaryString (10);
	}
	
	private static String RandomBinaryString(int n)
	{
		String s = new String();
		//Code goes here
		//Create a random binary string of just ones and zeros of length n
		int r;
		for (int i=0; i<n; i++)
		{
			Random rand = new Random (System.nanoTime());
			r = rand.nextInt(2);
			System.out.print (r);
			s += Integer.toString(r);
		}
		System.out.println ();
		System.out.println ("Binary string s is : ");
		System.out.print (s);
		return(s);
	}

}
