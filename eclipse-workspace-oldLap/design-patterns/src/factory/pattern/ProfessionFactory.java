package factory.pattern;

public class ProfessionFactory {
	
	public Profession getProfession(String typeOfProfession) throws Exception{
//	      if(typeOfProfession == null){
//	         return null;
//	      }
	      if("Doctor".equalsIgnoreCase(typeOfProfession)){
	      //if(typeOfProfession.equalsIgnoreCase("Doctor")){
	         return new Doctor();
	         
	      } 
	      else if("Engineer".equalsIgnoreCase(typeOfProfession)){
	         return new Engineer();
	         
	      } 
	      else if("Teacher".equalsIgnoreCase(typeOfProfession)){
	         return new Teacher();
	      }
	      else 
	    	 throw new Exception("please dont pass null as argument "); 
	      
	   }

}
