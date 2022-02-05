package hibernate_test.hibernatetest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.hibernate.entities.CustomerDetails;

public class HibernateUtil {

	static Session sessionObj;
	static SessionFactory sessionFactoryObj;

	// This Method Is Used To Create The Hibernate's SessionFactory Object
	private static SessionFactory buildSessionFactory() {
		// Create the ServiceRegistry from hibernate.cfg.xml
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()//
				.configure("hibernate.cfg.xml").build();

		// Create a metadata sources using the specified service registry.
		Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();

		return metadata.getSessionFactoryBuilder().build();
	}

	// Method 1: This Method Used To Create A New User Record In The Database
	// Table
	public static void createRecord() {
		CustomerDetails customerDetails;
		try {
			sessionObj = buildSessionFactory().openSession();
			sessionObj.beginTransaction();

			// for(int j=101; j<=105; j++) {
			// Creating User Data & Saving It To The Database
			customerDetails = new CustomerDetails();
			customerDetails.setCustomerId("cust_" + 2);
			customerDetails.setInternalCustomerId("internal_cust_" + 2);
			customerDetails.setEmail("mohithiber@gmail.com");

			sessionObj.save(customerDetails);
			// }

			// Committing The Transactions To The Database
			sessionObj.getTransaction().commit();
		} catch (Exception sqlException) {
			if (null != sessionObj.getTransaction()) {
				System.out.println("\n.......Transaction Is Being Rolled Back.......");
				sessionObj.getTransaction().rollback();
			}
			sqlException.printStackTrace();
		} finally {
			if (sessionObj != null) {
				sessionObj.close();
			}
		}
		System.out.println("\n.......Records Saved Successfully In The Database.......\n");
	}

}