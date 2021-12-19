package lockdown;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
class Employe 
{
	private String name = "";
	private int roll;
	public String getName() {
		return name;
	}
	public int getRoll() {
		return roll;
	}
	Employe(String name ,  int roll)
	{
		this.name = name;
		this.roll = roll;
	}
	
	public String toString()
	{
		return name + "--" +roll;
	}
	public int hashCode()
	{
		return this.roll + name.hashCode() ;
		//return roll ;
	}
	
	public boolean equals(Object obj)
	{
		Employe e = (Employe) obj;
		if ( this.roll == e.roll && this.name ==  e.name  )
		//if(this == e  )  allow duplicates
			return true ;
		return false;
	}
	
	
}
class Important
{
	public static void main(String[] args) 
	{
		Employe e1 = new Employe("shree",23);
		Employe e2 = new Employe("bru",25);
		Employe e3 = new Employe("sriky",1);
		Employe e4 = new Employe("sravani",15);
		Employe e5 = new Employe("sravani",15);
		Comparator<Employe> namecomp = new Comparator<Employe>()
		{

			@Override
			public int compare(Employe arg0, Employe arg1) {
				// TODO Auto-generated method stub
				
				return arg0.getName().compareTo(arg1.getName());
			}
			
		};
		Comparator rollcomp = new Comparator<Employe>()
		{
			public int compare(Employe e1,Employe e2)
			{
				if(e1.getRoll()>e2.getRoll())
					return 1;
				else if(e1.getRoll()<e2.getRoll())
				//else
					return -1;
				else
					return 0; // if zero is returned then that object is not added. so 
				              // this doesnt allow duplicates to
			}
		};
		//Set<Employe> emp = new TreeSet<Employe>(rollcomp);
		Set<Employe> emp = new HashSet<Employe>();
		//List<Employe> emp = new ArrayList<Employe>();
		//emp.add(null);
		emp.add(e1);emp.add(e2);emp.add(e3);emp.add(e4);emp.add(e5);
		
		//Collections.sort(emp,namecomp);
		
		
		emp.forEach(n -> System.out.println(n));
		
		
		
		
	}
}