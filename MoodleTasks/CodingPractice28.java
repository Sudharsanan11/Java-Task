class kgm{

	int sid;
	String sname;

kgm(int i, String n){

	 sid = i;
	 sname = n;

}
void disp(){System.out.println("Student ID: " + sid);
		System.out.println("Student Name: " + sname);}

	public static void main(String[] args){
	
		kgm s1 = new kgm(1001,"Arun.J");
		
			s1.disp();
			
}

}