class sample2{

static int count = 0;
	
	sample2()
	{

	count++;
	System.out.println(count);

	}
	void sum()
	{
		int a = 5, b = 10;
		System.out.println(a + b);

}
	public static void main(String[] args){
	
	sample2 obj = new sample2();
	obj.sum();
	sample2 obj1 = new sample2();
	sample2 obj2 = new sample2();

}
}