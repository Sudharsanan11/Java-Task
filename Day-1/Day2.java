import java.util.Scanner;
class Day2{

	public static void main(String[] args){
	System.out.println("Hello World!");
	Scanner sc = new Scanner(System.in);

	System.out.println("-----The Sum of two numbers-----");
	int a = 10,b = 20;
	System.out.println("The sum of the two number is : " + (a+b));

	System.out.println("-----The Product of two numbers-----");
	System.out.println("Enter the first number : ");
	int firstNumber = sc.nextInt();
	System.out.println("Enter the second number : ");
	int secondNumber = sc.nextInt();
	System.out.println("The product of the two numbers is : " + firstNumber * secondNumber);

	System.out.println("-----The Arithmetic Operations-----");
	System.out.println("Enter the first number : ");
	int c = sc.nextInt();
	System.out.println("Enter the second number : ");
	int d = sc.nextInt();
	System.out.println("Sum of Two Numbers : " + (c+d));
	System.out.println("Subraction of Two Numbers : " + (c - d));
	System.out.println("Multiplication of Two Numbers : " + c * d);
	System.out.println("Division of Two Numbers : " + c / d);

	System.out.println("-----The Average of Five Numbers-----");
	System.out.println("Enter the first number : ");
	int e = sc.nextInt();
	System.out.println("Enter the second number : ");
	int f = sc.nextInt();
	System.out.println("Enter the third number : ");
	int g = sc.nextInt();
	System.out.println("Enter the fourth number : ");
	int h = sc.nextInt();
	System.out.println("Enter the fivth number : ");
	int i = sc.nextInt();
	int sum = e+f+g+h+i;
	System.out.println("The average of the given Numbers is: " + sum/5);

	System.out.println("-----Area of Circle-----");
	System.out.println("Enter the radius : ");
	int radiusC = sc.nextInt();
	double areaC = 3.14 * radiusC * radiusC;
	System.out.println("Area of Circle is : " + areaC);
	
	System.out.println("-----Area of Rectangle-----");
	System.out.println("Enter the Width : ");
	int widthR = sc.nextInt();
	System.out.println("Enter the Length : ");
	int lengthR = sc.nextInt();
	int areaR = widthR * lengthR;
	System.out.println("Area of Rectangle is : " + areaR); 

	System.out.println("-----Area of Triangle-----");
	System.out.println("Enter the Base : ");
	int baseT = sc.nextInt();
	System.out.println("Enter the Height : ");
	int heightT = sc.nextInt();
	int areaT =  (baseT * heightT)/2;
	System.out.println("Area of Triangle is : " + areaT); 

	
	System.out.println("-----Area of Equilateral Triangle-----");
	System.out.println("Enter the Length : ");
	int lengthE = sc.nextInt();
	double areaE = (1.73 * lengthE * lengthE)/4;
	System.out.println("Area of Equilateral Triangle is : " + areaE);

	System.out.println("-----Area of Rhombus-----");
	System.out.println("Enter the Base : ");
	int baseRh = sc.nextInt();
	System.out.println("Enter the Height : ");
	int heightRh = sc.nextInt();
	int areaRh = baseRh * heightRh;
	System.out.println("Area of Rhombus is : " + areaRh);
	
	System.out.println("-----Area of Parallelogram-----");
	System.out.println("Enter the Base : ");
	int baseP = sc.nextInt();
	System.out.println("Enter the Height : ");
	int heightP = sc.nextInt();
	int areaP = baseP * heightP;
	System.out.println("Area of Parallelogram is : " + areaP);

	System.out.println("-----Area of Prism-----");
	System.out.println("Enter the Base Area : ");
	int baseareaPr = sc.nextInt();
	System.out.println("Enter the Base Perimeter : ");
	int baseperiPr = sc.nextInt();
	System.out.println("Enter the Height : ");
	int heightPr = sc.nextInt();
	int areaPr = (2 * baseareaPr) + (baseperiPr * heightPr);
	System.out.println("Area of the Prism is : " + areaPr); 

	System.out.println("-----Area of Sphere-----");
	System.out.println("Enter the Radius : ");
	int radiusS = sc.nextInt();
	double areaS = 4 * 3.14 * radiusS * radiusS;
	System.out.println("Area of Sphere is : " + areaS);

	System.out.println("-----Area of Cylinder-----");
	System.out.println("Enter the Radius : ");
	int radiusCy = sc.nextInt();
	System.out.println("Enter the Height : ");
	int heightCy = sc.nextInt();
	double areaCy = (2 * 3.14 * radiusCy * heightCy) + (2 * 3.14 * radiusCy * radiusCy);
	System.out.println("Area of Cylinder is : " + areaCy);

	System.out.println("-----Concatenate two string-----");
	System.out.println("Enter the first name : ");
	String Fname = sc.nextLine();
	System.out.println("Enter the last name : ");
	String Lname = sc.nextLine();
	System.out.println(Fname +" "+Lname);
}
}