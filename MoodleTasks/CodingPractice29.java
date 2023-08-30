import java.util.Scanner;
class kgm{

static	int a = 1;
static	int b = 2;
static	int temp = 0;

kgm(){

	temp = a+b;
	a = b;
	b = temp;
}

void disp(){System.out.println(temp);}
	public static void main(String[] args){


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(a);
		System.out.println(b);

		for(int i = 1;i<n-1;i++)
		{

			kgm k = new kgm();
			k.disp();

		}			
}
}