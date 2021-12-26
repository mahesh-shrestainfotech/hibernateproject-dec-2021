import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sit.entity.Product;
import com.sit.util.HibernateUtil;

public class TestAdd {

	public static void main(String[] args) {

		Product product = new Product(170,"Savlon 350", 300,"Sanitizer", 45);
		
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
	
		Transaction transaction = session.getTransaction();
		
		transaction.begin();			
			session.save(product);
		transaction.commit();
		
		session.close();
		
		sessionFactory.close();

	}

}
