class data_variable{
static short c = 130, d = 10;
static float i = 250.50f, j = 2.75f;
int e = 200, f = 40;
double k = 80.123456d, l = 4.123456d;
	public static void main(String args[]){
	data_variable obj = new data_variable();
	byte a = 10,b = 5;
	long g = 12345678902l, h = 2;

	System.out.println("sum:"+a+b);
	System.out.println("sub:"+(a-b));
	System.out.println("mul:"+a*b);
	System.out.println("div:"+a/b);

	System.out.println("sum:"+c+d);
	System.out.println("sub:"+(c-d));
	System.out.println("mul:"+c*d);
	System.out.println("div:"+c/d);

	System.out.println("sum:"+obj.e+obj.f);
	System.out.println("sub:"+(obj.e-obj.f));
	System.out.println("mul:"+obj.e*obj.f);
	System.out.println("div:"+obj.e/obj.f);

	System.out.println("sum:"+g+h);
	System.out.println("sub:"+(g-h));
	System.out.println("mul:"+g*h);
	System.out.println("div:"+g/h);

	System.out.println("sum:"+i+j);
	System.out.println("sub:"+(i-j));
	System.out.println("mul:"+i*j);
	System.out.println("div:"+i/j);

	System.out.println("sum:"+obj.k+obj.l);
	System.out.println("sub:"+(obj.k-obj.l));
	System.out.println("mul:"+obj.k*obj.l);
	System.out.println("div:"+obj.k/obj.l);
}
}

Output:
----------
sum:105
sub:5
mul:50
div:2

sum:13010
sub:120
mul:1300
div:13

sum:20040
sub:160
mul:8000
div:5

sum:123456789022
sub:12345678900
mul:24691357804
div:6172839451

sum:250.52.75
sub:247.75
mul:688.875
div:91.09091

sum:80.1234564.123456
sub:76.0
mul:330.385545383936
div:19.43114125626659