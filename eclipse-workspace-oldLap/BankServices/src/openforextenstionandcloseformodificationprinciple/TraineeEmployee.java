package openforextenstionandcloseformodificationprinciple;

public class TraineeEmployee extends Employee{

	private String tariningArea;

	public TraineeEmployee(String name, int id, String tariningArea) {
		super(name, id);
		this.tariningArea = tariningArea;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("emplyee name is  " + getName() + " emplyee id is " + getId() + " address is " + tariningArea);
	}
}
