class Employee{

	int eid;
	String ename; 
	long phno;
	static String mgr;
	Employee(int eid, String ename, long phno, String mgr)
	{
		this.eid = eid;
		this.ename = ename;
		this.phno = phno;
		this.mgr = mgr;
	}
	void display(){
		System.out.println("id: " + eid + " ename: "+ ename + " phno: " + phno + " mgr: " + mgr);
}
	public static void main(String[] args){

		Employee Ammu = new Employee(501,"Ammu",1234567891l,"Bhanu");
		Employee Scott = new Employee(502,"Scott",1234567892l,"Bhanu");
		Employee Kams = new Employee(503,"Kams",1234567893l,"Bhanu");
		Ammu.display();
		Scott.display();
		Kams.display();

}
}