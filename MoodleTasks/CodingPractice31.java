import java.util.Scanner;

class kgm{
	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	int id = sc.nextInt();
	
	int m1 = sc.nextInt();
	int m2 = sc.nextInt();
	int m3 = sc.nextInt();
	void sum(){
	int c = m1+m2+m3;
	float d = (c*100)/300;
	System.out.println("Total="+c);
	System.out.println("Percentage="+d);
	if ((d>40)&&(d<50)){
	System.out.println("Grage=C");
	}else if((d>50)&&(d<60)){
		System.out.println("Grage=B");
	}
	else if((d>60)&&(d<70)){
		System.out.println("Grage=A");
	}
	else if((d>70)&&(d<80)){
		System.out.println("Grage=S");
	}
	else if((d>80)&&(d<100)){
		System.out.println("Grage=O");
	}
	}

	
	void display(){
	System.out.println("Student ID:"+id);
	System.out.println("Student Name:"+name);
	System.out.println("m1="+m1);
	System.out.println("m2="+m2);
	System.out.println("m3="+m3);
	
	}
public static void main(String args[]){
	kgm a = new kgm();
	a.display();
	a.sum();
	
}
	
}