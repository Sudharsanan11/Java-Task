import java.util.Scanner;
public class EvenOdd{

public static void findEvenOdd(int num){


	if(num%2 == 0){

		System.out.println(num + " is a Even number");
}
	else
		System.out.println(num + " is a Odd number");

}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

			findEvenOdd(num);

}

}