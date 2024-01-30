import entity.Laptop;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.FactoryConfiguration;

import java.util.List;

public class Hql {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //---HQL---USE--//

        String hql="FROM Laptop ";
        Query query = session.createQuery(hql);
        List<Laptop>lplist=query.list();

        for (Laptop l1:lplist
             ) {
            System.out.println(l1.getLId()+" "+ l1.getName()+" "+l1.getStudent());
            System.out.println(l1);

        }


        transaction.commit();
        session.close();
    }
}
