package FactoryClass;

public class Main {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Car audi = (Car) Factory.getObject("FactoryClass.Car");
		audi.disp();
	}
	
}
