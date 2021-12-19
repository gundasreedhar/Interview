package FactoryClass;

public class Factory {
	static Object getObject(String clsname) throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		return ((Car)Class.forName(clsname).newInstance());
	}
}
 