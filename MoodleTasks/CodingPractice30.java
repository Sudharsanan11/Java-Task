import java.util.Scanner;
class kgm{

Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = "";
		int i;

kgm(){

	for(i = a.length()-1;i>=0;i--)
	{

		b += a.charAt(i);

	}	
		
}

void disp(){

	if(a.equals(b)){
		System.out.println(a + " is a palindrome");}
	else{
		System.out.println(a + " is not a palindrome");}

}

	public static void main(String[] args){


		kgm k = new kgm();
		k.disp();
				
}
}