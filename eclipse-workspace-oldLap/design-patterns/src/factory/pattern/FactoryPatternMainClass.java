package factory.pattern;

public class FactoryPatternMainClass {
	
	public static void main(String[] args) throws Exception {
		ProfessionFactory professionFactory = new ProfessionFactory();
		
		Profession doc = professionFactory.getProfession(null);
		doc.print();
		
	}

}
