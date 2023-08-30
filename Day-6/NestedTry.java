public class NestedTry{

	public static void main(String[] args){
		

	try{
			//inner try block
		try{

			System.out.println("going to divide by 0");

			int b = 39/1;
		}
		catch(ArrayIndexOutOfBoundsException a){
			System.out.println(a);

		}
		try{
			int a[] = new int[5];
			a[5] = 4;
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
			System.out.println("other statement");
		}
	catch(Exception e){
			System.out.println("handled the exception (outer catch)");
		}
		System.out.println("normal flow...");

	}
}