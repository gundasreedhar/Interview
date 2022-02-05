package hibernate_test.hibernatetest;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
public class AppMain {

	public static void main(String[] args) {
		HibernateUtil.createRecord();

		//HibernateUtil.updateRecord();

		System.exit(0);
	}
}