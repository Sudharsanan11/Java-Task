import java.util.Scanner;

class kgm{

static int re;
static float rh;
Scanner sc = new Scanner(System.in);

int l = sc.nextInt();
int w = sc.nextInt();
int p = sc.nextInt();
int q = sc.nextInt();

void Rectangle(){

	re = l*w;
	System.out.println(re);

}

void Rhombus(){

	rh = (p*q)/2;
	System.out.println(rh);


}
	
	public static void main(String[] args){

		kgm k = new kgm();
		k.Rectangle();
		k.Rhombus();	
}	
}s