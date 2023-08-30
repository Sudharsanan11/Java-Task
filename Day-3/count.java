import java.io.*;

class count{

	public static void main(String[] args){

		String str = "My User Name is Scott@123";
		int countc = 0,counts = 0, countn = 0, counto = 0;

		for(int i=0; i < str.length(); i++){
			char c = str.charAt(i);
			if(c >='A' && c <= 'Z'){
				countc++;

			}
			else if(c >= 'a' && c <= 'z'){
				countc++;
			}
			else if(c >= '0' && c <= '9'){
				countn++;
			}
			else if(c == ' '){
				counts++;
			}
			else{
				counto++;
			}
}
		System.out.println("The Count of the Letters: " + countc);
		System.out.println("The Count of the Spaces: " + counts);
		System.out.println("The Count of the Numbers: " + countn);
		System.out.println("The Count of the Other Characters: " + counto);
		
}
}