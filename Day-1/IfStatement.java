import java.util.Scanner;
class IfStatement{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your mark : ");
int Mark = sc.nextInt();
	/* if(age>=18){
	System.out.println("The Voter is eligible for Voting");}
	else{
	System.out.println("The Voter is not eligible for voting");} */


	if(Mark>=0 && Mark<=39){
	System.out.println("Your Grade is " + "D");}

	else if(Mark>=40 && Mark<=59){
	System.out.println("Your Grade is "+ "C");}

	else if(Mark>=60 && Mark<=79){
	System.out.println("Your Grade is "+ "B");}

	else if(Mark>=80 && Mark<=89){
	System.out.println("Your Grade is "+ "A");}

	else if(Mark>=90 && Mark<=100){
	System.out.println("Your Grade is "+ "O");}
}
}