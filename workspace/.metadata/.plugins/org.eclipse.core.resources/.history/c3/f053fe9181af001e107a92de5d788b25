package tw.ispan.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class HibernateUtil {
	
	private static final SessionFactory factory = createSessionFactory();
	
	private static SessionFactory createSessionFactory() {
			StandardServiceRegistry SessionRegistry = new StandardServiceRegistryBuilder().configure().build();
			
			SessionFactory factory = new MetadataSources(SessionRegistry).buildMetadata().buildSessionFactory();
			return factory;
	}
	public static SessionFactory getSessionFactory() {
		return factory;
		
	}
	public static void closegetSessionFactory() {
		if (factory != null) {
			factory.close();
			
		}
	}
}
