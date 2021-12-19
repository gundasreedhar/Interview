package beans.Spring;

import java.util.List;

//Java bean Style POJO class 
class Car{
	List<String> model;
	Tyre t;
	public void setModel(List<String> model) {
		this.model = model;
	}
	public List<String> getModel() {
		return model;
	}
	public void setT(Tyre t) {
		this.t = t;
	}
	public Tyre getT() {
		return t;
	}
	
	Car(){}
	Car(Tyre t)
	{
		this.t = t;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The model name is " + model + "\n its tyre is " + t.getBrand();
	}
/*	private Tyre tyre;
	@Required
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	public Tyre getTyre() {
		return tyre;
	}
	
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println(tyre);
	}
	public Car() {
		// TODO Auto-generated constructor stub
		System.out.println("car created");
	}
	public void change(String n)
	{
		tyre.setBrand(n);
	}
	
	
	
	
	
	*/
	//public void disp();
} 