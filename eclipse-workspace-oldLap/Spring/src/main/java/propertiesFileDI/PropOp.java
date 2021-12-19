package propertiesFileDI;

public class PropOp {
	private String name;
	private String pass;
	public void setName(String name) {
		this.name = name;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public String getPass() {
		return pass;
	}
	
	public void disp()
	{
		System.out.println("name:" + getName() + "password" + getPass());
	}
}
