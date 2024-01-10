package tw.ispan.action;


import org.hibernate.Session;
import org.hibernate.SessionFactory;


import tw.ispan.model.Department;
import tw.ispan.util.HibernateUtil;

public class DemoDepartmentEx2 {

	public static void main(String[] args) {
		
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		
		Department dept = new Department();
		dept.setDepartmentName("MIS 部門");
		
		session.save(dept);
		
		session.getTransaction().commit();
		
		session.close();
		
		HibernateUtil.closegetSessionFactory();
		
		

	}

}
