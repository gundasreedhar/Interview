class Plane
{
	public void takeoff()
	{
		System.out.println("Plaane taking off");
	}
	public void land()
	{
		System.out.println("Plaane landing");
	}
}
class CargoPlane extends Plane
{
	public void takeoff()
	{
		System.out.println("Cargo Plane taking off");
	}
	public void land()
	{
		System.out.println("Cargo Plaane landing");
	}
}
class WarPlane extends Plane
{
	public void takeoff()
	{
		System.out.println("War Plane taking off");
	}
	public void land()
	{
		System.out.println("War Plaane landing");
	}
}
//Polymorphism with code reduction code flexibility is achived
class Airport
{
	void permit (Plane ref)
	{
		ref.takeoff();
		ref.land();
	}
}
class P3 
{
	public static void main(String[] args) 
	{
		CargoPlane cp = new CargoPlane();
		WarPlane wp = new WarPlane();
		Airport a = new Airport();
		a.permit(cp);
		a.permit(wp);

	}
}
