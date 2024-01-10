package tw.ispan.action;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import tw.ispan.model.Department;
import tw.ispan.util.HibernateUtil;

public class DemoDepartmentEx4 {

	public static void main(String[] args) {
		
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			
			Department dept = new Department();
			dept.setDepartmentName("按摩部門2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222");
			
			session.save(dept);
			
			tx.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("出事了阿北!! Rollback!!!");
			tx.rollback();
		}finally {
			HibernateUtil.closegetSessionFactory();
			
		}
		
		
		
		
		
		

	}

}
