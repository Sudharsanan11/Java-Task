class CopyCon2 implements Cloneable{

	int rollno;
	String name;

CopyCon2(int rollno, String name){

	this.rollno = rollno;
	this.name = name;

}

public Object clone()throws CloneNotSupportedException{

	return super.clone();

}

public static void main(String[] args){

try{

	CopyCon2 s1 = new CopyCon2(101,"Scott");

	CopyCon2 s2 = (CopyCon2)s1.clone();

	System.out.println(s1.rollno + " " + s1.name);
	System.out.println(s2.rollno + " " + s2.name);

}catch(CloneNotSupportedException c){}

}

}