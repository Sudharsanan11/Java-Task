import java.util.Scanner;
class kgm{

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int sum = a+b;
	int diff = a-b;
	int pro = a*b;
	float avg = (a+b)/2;
	int dis = a-b;
	System.out.println(sum);
	System.out.println(diff);
	System.out.println(pro);
	System.out.println(avg);
	System.out.println(dis);
	if(a>b){
	System.out.println(a);}
	else{
	System.out.println(b);}
	if(a<b){
	System.out.println(a);}
	else{
	System.out.println(b);}
	

}
}
