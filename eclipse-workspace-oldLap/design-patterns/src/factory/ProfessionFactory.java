package factory;

public class ProfessionFactory {
	
	public Profession getProfession(String typeOfProfession) throws Exception{
		// this null check is also not req if we write the code like this
//	      if(typeOfProfession == null){
//	         return null;
//	      }
		
	      if("Doctor".equalsIgnoreCase(typeOfProfession)){     // this will not throw NPE when passed null
	      //if(typeOfProfession.equalsIgnoreCase("Doctor")){   // Most imp : this line will throw the NULL POINTER EXCEPTION
	         return new Doctor();
	         
	      }
	      else if("Engineer".equalsIgnoreCase(typeOfProfession)){
//	      else if(typeOfProfession.equalsIgnoreCase("Engineer")){
	         return new Engineer();
	         
	      } 
	      else if("Teacher".equalsIgnoreCase(typeOfProfession)){
//		  else if(typeOfProfession.equalsIgnoreCase("Teacher")){
	         return new Teacher();
	      }
	      else
	    	  throw new Exception("please pass the correct name");
	   }

}
