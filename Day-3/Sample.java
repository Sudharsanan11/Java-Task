 class Sample{

	public static void main(String[] args)
	{

	String str = "My user Name is Scott@123";
	int countc = 0, counts = 0,countn = 0;

	for (int i = 0; i < str.length(); i++) 
	{
 		if (Character.isLetter(str.charAt(i)))
		{
   			countc++;
		}
	}
	System.out.println("The Count of the Characters are: " + countc);
		for(int j=0; j < str.length(); j++){
			if(str.charAt(j) == ' ')
			{
				counts++;
			}

	}
	System.out.println("The Count of the spaces are: " + counts);
		for(int k=0; k < str.length(); k++)
		{
			if(Character.isDigit(str.charAt(k)))
			{
				countn++;
			}
		}
	System.out.println("The Count of the Numbers are: " + countn++);


} 
}