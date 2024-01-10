package tw.ispan.action;


import org.hibernate.Session;
import org.hibernate.SessionFactory;


import tw.ispan.model.Department;
import tw.ispan.util.HibernateUtil;

public class DemoDepartmentEx7 {

	public static void main(String[] args) {
		
		//刪除資料的方式
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session = factory.getCurrentSession();
		
	
		
		try {
			session.beginTransaction();
			
			Department dept = session.get(Department.class, 6);
			session.delete(dept);
			
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("出事了阿北!! Rollback!!!");
			session.getTransaction().rollback();
		}finally {
			HibernateUtil.closegetSessionFactory();
			
		}
		
		
		
		
		
		

	}

}
