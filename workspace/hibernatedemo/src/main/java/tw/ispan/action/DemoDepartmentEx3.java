package tw.ispan.action;


import org.hibernate.Session;
import org.hibernate.SessionFactory;


import tw.ispan.model.Department;
import tw.ispan.util.HibernateUtil;

public class DemoDepartmentEx3 {

	public static void main(String[] args) {
		
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		
		Department dept = new Department();
		dept.setDepartmentName("RD");
		
		session.save(dept);
		
		session.getTransaction().commit();
		
		HibernateUtil.closegetSessionFactory();
		
		

	}

}
