package br.com.fip.pp.exoticacalcados.util;



import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * 
 * @author LuizCarlos
 *
 */

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	
	static {
		Configuration configuration = new Configuration().configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	}	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	    
}
