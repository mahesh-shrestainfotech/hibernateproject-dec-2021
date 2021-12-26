import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sit.entity.Product;
import com.sit.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Product product = session.get(Product.class, 2);
		
		System.out.println(product);
		
		session.close();
		
		sessionFactory.close();
		
	}

}
