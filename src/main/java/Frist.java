import entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

public class Frist {
    public static void main(String[] args) {
        Customer c1=new Customer();
        c1.setId("C011");
        c1.setName("gaaji");
        c1.setAddress("gaale");
        c1.setTel(075321456);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(c1);
        transaction.commit();
        session.close();
    }
}
