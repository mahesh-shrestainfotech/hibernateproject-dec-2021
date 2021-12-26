import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sit.entity.Bid;
import com.sit.entity.Item;
import com.sit.util.HibernateUtil;

public class TestItem {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
	
		Item item = session.get(Item.class,1l);
		
		System.out.println(item);
		System.out.println();
		Set<Bid> bids = item.getBids();
		
		for (Bid bid : bids) {
			System.out.println(bid);
			System.out.println();
		}
		
		session.close();
		
		sessionFactory.close();
	}

}
