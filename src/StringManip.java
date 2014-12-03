
public class StringManip {
	
	public static void main(String[] args)
	{
		System.out.println(ConvertToProperCase("john y cc    doe MARGARITA    hEEEE"));
	}
	public static String ConvertToProperCase(String strName)
	{
		String [] names = strName.split(" ");
		String retVal = "";
		for(int i = 0; i < names.length; i++)
		{
			if (names[i].equals(""))
				continue;
			String firstChar = names[i].substring(0, 1).toUpperCase().trim();
			String restString = names[i].substring(1).toLowerCase().trim();

				retVal += firstChar + restString + " ";
		}
		return retVal;
	}

}
