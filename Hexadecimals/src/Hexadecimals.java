
public class Hexadecimals {
	
	public static void main (String [] agrs)
	{
		int num = 200; //<- user input here
		String hexa ="";
		System.out.println("Decimal number is : "+num);
		
		hexa = hexaABC(num);	
		
		if (num > 15)
		{
			int res = num/16;
			int mod = num%16;
			//System.out.println("res is : "+res);
			//System.out.println("mod is : "+mod);
			
			hexa += hexaABC(mod);
					
			while (res>15)
			{
				int m = res%16;
				res =  res/16;
				//System.out.println("m number is : "+m);

				hexa += hexaABC(m);
			}
			
			//System.out.println("res number is : "+res);
			hexa += hexaABC(res);
			hexa = reverse(hexa);
			
		}
		
		System.out.println("Hexa number is : "+hexa);
		
	}
	
	public static String reverse (String x)
	{
		String y ="";
		for (int i=x.length()-1; i>=0; i--)
		{
			y+=x.charAt(i);
		}
		return y;
	}
	
	public static String hexa (int num)
	{
		String hexa = "";
		
		if (num < 10)
		{
			hexa = String.valueOf(num);
		}
		else if (num > 9 && num < 16)
		{
			hexa = hexaABC(num);
		}
		
		return hexa;
	}
	
	public static String hexaABC (int num)
	{
		String hexa="";
		
		if (num < 10)
		{
			hexa = String.valueOf(num);
		}
		
		switch (num)
		{
		case 10:
			hexa +='A';
			break;
		
		case 11:
			hexa +='B';
			break;
		
		case 12:
			hexa +='C';
			break;
			
		case 13:
			hexa +='D';
			break;
			
		case 14:
			hexa +='E';
			break;
			
		case 15:
			hexa +='F';
			break;
			
		}
		
		return hexa;
	}

}
