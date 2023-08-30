class Sudh{

	int id;
	String name;
Sudh(int i, String n){

	id = i;
	name = n;

}
void disp(){System.out.println(id + " " + name);}
	public static void main(String[] args){

		Sudh s1 = new Sudh(111,"Karan");
		Sudh s2 = new Sudh(112,"Scott");
		s1.disp();
		s2.disp();

}
}