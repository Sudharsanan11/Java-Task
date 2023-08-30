class CopyCon{

	int id;
	String name;

CopyCon(int i, String n){

	id = i;
	name = n;

}
CopyCon(){}
void disp(){System.out.println(id + " " + name);}


	public static void main(String[] args){

		CopyCon s1 = new CopyCon(111,"Scott");
		CopyCon s2 = new CopyCon();
		s2.id = s1.id;
		s2.name = s1.name;
		s1.disp();
		s2.disp();


}

}