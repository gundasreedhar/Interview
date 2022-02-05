package factory;

import java.util.Optional;

public class FactoryPatternMainClass {
	
	public static void main(String[] args) throws Exception {
		ProfessionFactory professionFactory = new ProfessionFactory();
		
//		Optional<Profession> doc = Optional.ofNullable(professionFactory.getProfession(null)) ;
//		doc.get().print();
		
		Profession doctor = professionFactory.getProfession("doctor");
		doctor.print();
	}

}
