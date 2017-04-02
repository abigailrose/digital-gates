public class Gates
{
	public static boolean not(boolean a)
	{
		return (!a);
	}
	
	public static boolean or(boolean a, boolean b)
	{
		return (a || b);
	}
	
	public static boolean and(boolean a, boolean b)
	{
		return (a && b);
	}
	
	public static boolean nor(boolean a, boolean b)
	{
		return !(a || b);
	}
	
	public static boolean nand(boolean a, boolean b)
	{
		return !(a && b);
	}
	
	public static boolean xor(boolean a, boolean b)
	{
		if(a == b)
			return false;
		else
			return true;
	}
	
	public static boolean xnor(boolean a, boolean b)
	{
		if(a == b)
			return true;
		else
			return false;
	}
}