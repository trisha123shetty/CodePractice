package OOp;
class Details{
	private int eid;
	private String name;
	private String address;
	private int eage;
	public void setName(String name) {
		this.name= name;
	}
	public void setEid(int eid) {
		this.eid= eid;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setAge(int age) {
		this.eage=age;
	}
	public int getId() {
		return eid;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public int geteage() {
		return eage;
	}
}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Details d = new Details();
		d.setAddress("Mulki");
		d.setAge(25);
		d.setName("trisha");
		d.setEid(1);
		System.out.println(d.getAddress()+" "+d.geteage()+" "+d.getName()+" "+d.getId());
				

	}

}
