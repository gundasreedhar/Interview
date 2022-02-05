package openforextenstionandcloseformodificationprinciple;

/*
It states  that  “Software components should be open for extension, but closed for modification”

The term “Open for extension” means that we can extend and include extra functionalities in our code without altering or affecting our existing implementation.

The term “Closed for modification” means that after we add the extra functionality, we should not modify the existing implementation.

In real world, You must have noticed that you change something to cater a new requirement and some other functionality breaks because of your change. To prevent that we have this principle in hand.


 How to implement Open/Closed Principle in solid principles?

The application classes should be designed in such a way that whenever fellow developers want to change the flow of control in specific conditions in application, all they need to extend the class and override some functions and that’s it.

for method level example refer Deposite and Notification classes
field level Example - created a pojo employee with id , name. now new functionality comes which says add Training location. your constructor will fail for employees who didnt do training. better extend employee class, name it Traineed employee then add constructor.

*/

public class Employee {
	private String name;
	private int id;

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void print() {
		System.out.println("emplyee name is  " + name + " emplyee id is " + id);
	}
}
