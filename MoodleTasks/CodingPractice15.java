import java.util.Scanner;
class kgm{

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	for(int i=1;i<=5;i++){
	for(int j=i;j<=5;j++){
	System.out.print(" ");
	}
	for(int k=1;k<=i;k++){
	System.out.print("* ");
	}
	System.out.println();
	}
}
}

