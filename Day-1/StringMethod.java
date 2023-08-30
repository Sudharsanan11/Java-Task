class StringMethod{

	public static void main(String[] args){
	String str1 = "Batch-17 is toxic";
	
	System.out.println("contains() : "+ str1.contains("toxic"));
	//to check whether the string object contains the given value or not.

	System.out.println("equals() : "+ str1.equals("Batch-17 is toxic"));
	//to check whether the string object equal to the given value or not.

	System.out.println("equalsIgnoreCase() : "+ str1.equalsIgnoreCase("Batch-17 is Toxic"));
	//to check whether the string object equal to the given value or not but it does care about the case.

	System.out.println("concat() : " + str1.concat(", But sometimes \"sweet!\\\""));
	//to check whether the string object equal to the given value or not but it does care about the case.

	System.out.println("toUpperCase() : " + str1.toUpperCase());
	//to check whether the string object equal to the given value or not but it does care about the case.

	System.out.println("toLowerCase() : " + str1.toLowerCase());
	//to check whether the string object equal to the given value or not but it does care about the case.

	System.out.println("length() : " +str1.length());
	//to check whether the string object equal to the given value or not but it does care about the case.

	System.out.println("charAt() : "+ str1.charAt(6));
	//to check whether the string object equal to the given value or not but it does care about the case.

	System.out.println("compareTo() : "+ str1.compareTo(Batch-17 is Toxic));
	//to check whether the string object equal to the given value or not but it does care about the case.

	System.out.println("compareToIgnoreCase() : "+ str1.compareToIgnoreCase());
	//to check whether the string object equal to the given value or not but it does care about the case.

	System.out.println("indexOf() : "+ str1.indexOf('B'));
	//to check whether the string object equal to the given value or not but it does care about the case.

	System.out.println("isEmpty() : "+ str1.isEmpty());
	//to check whether the string object equal to the given value or not but it does care about the case.

	System.out.println("replace() : "+ str1.replace("toxic", "Sweet"));
	//to check whether the string object equal to the given value or not but it does care about the case.

	System.out.println("substring() : "+ str1.substring(2, 7));
	//to check whether the string object equal to the given value or not but it does care about the case.

	System.out.println("trim() : "+ str1.trim());
	//to check whether the string object equal to the given value or not but it does care about the case.

	System.out.println("hashcode() : "+ str1.hashcode());
	//to check whether the string object equal to the given value or not but it does care about the case.

	System.out.println("format() : "+ str1.format());
	//to check whether the string object equal to the given value or not but it does care about the case.

	System.out.println("join() : "+ str1.join());
	//to check whether the string object equal to the given value or not but it does care about the case.

	System.out.println("replaceAll() : "+ str1.replaceAll("i", "A"));
	//to check whether the string object equal to the given value or not but it does care about the case.

	System.out.println("split() : "+ str1.split());
	//to check whether the string object equal to the given value or not but it does care about the case.


}

}