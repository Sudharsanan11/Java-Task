import java.util.Scanner;

class NestedExample{

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter your age");
	int age = sc.nextInt();
	if(age>=17){
	System.out.println("Enter your percentage");
	int percentage = sc.nextInt();
	if(percentage>=60){
	System.out.println("You are Eligible");
	}
	else{
       System.out.println("Konja Nalla Padikanum");}
	}
	else{
	System.out.println("Age Does not match the requirement");
	}

}

}